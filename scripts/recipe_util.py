# SPDX-License-Identifier: BSD-2-Clause
# Copyright (c) 2020, Konrad Weihmann

import sys

try:
    from oelint_parser.cls_item import Variable
    from oelint_parser.cls_stash import Stash
    from oelint_parser.const_vars import get_base_varset
    from oelint_parser.helper_files import expand_term
    from oelint_parser.helper_files import guess_recipe_name
except ImportError:
    sys.stderr.write("Can't import 'oelint-parser'. Please run 'pip install oelint-parser' to enable this script here\n")

def __get_info_from_stash(_filepath, name, modifiers):
    _result = set()

    _stash = Stash(quiet=True)
    _stash.AddFile(_filepath)
           
    for item in _stash.GetItemsFor(attribute=Variable.ATTR_VAR, attributeValue=name):
        if modifiers and not all(x in modifiers for x in item.SubItems):
            continue
        _result.update([expand_term(_stash, _filepath, y)
                            for y in item.get_items()])

    return _result

def check_depends(depends, rdepends, oldrecipes):
    _rdepends = set()
    _depends = set()
    for x in oldrecipes:
        _depends.update(__get_info_from_stash(x, "DEPENDS", ["class-native"]))
        _rdepends.update(__get_info_from_stash(x, "RDEPENDS_${PN}", ["class-target"]))
    
    depends = set(list(depends) + list(_depends))
    rdepends = set(list(rdepends) + list(_rdepends))
    return (depends, rdepends)

def save_variables(name, modifiers, oldrecipes):
    old_values = set()
    for x in oldrecipes:
        old_values.update(__get_info_from_stash(x, name, modifiers))
    return old_values
