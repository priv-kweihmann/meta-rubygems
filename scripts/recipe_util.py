# SPDX-License-Identifier: BSD-2-Clause
# Copyright (c) 2020, Konrad Weihmann

import sys

try:
    from oelint_parser.cls_item import Export
    from oelint_parser.cls_item import Function
    from oelint_parser.cls_item import Variable
    from oelint_parser.cls_stash import Stash
    from oelint_parser.helper_files import expand_term
except ImportError:
    sys.stderr.write(
        "Can't import 'oelint-parser'. Please run 'pip install oelint-parser' to enable this script here\n")


def __get_info_from_stash(_filepath, name, modifiers):
    _result = set()

    _stash = Stash(quiet=True)
    _stash.AddFile(_filepath)

    for item in _stash.GetItemsFor(filename=_filepath, attribute=Variable.ATTR_VAR, attributeValue=name, nolink=True):
        if modifiers and not all(x in modifiers for x in item.SubItems):
            continue
        if item.Origin.endswith(".bbclass"):
            continue
        _result.update([expand_term(_stash, _filepath, y)
                        for y in item.get_items() if y not in ["\\", "\\\n", '"']])

    return _result


def __get_raw_stash(_filepath, classifier):
    _result = set()

    _stash = Stash(quiet=True)
    _stash.AddFile(_filepath)

    for item in _stash.GetItemsFor(filename=_filepath, classifier=classifier, nolink=True):
        _result.add(item)

    return _result


def check_depends(depends, rdepends, oldrecipes):
    _rdepends = set()
    _depends = set()
    for x in oldrecipes:
        _depends.update(__get_info_from_stash(x, "DEPENDS", ["class-native"]))
        _rdepends.update(__get_info_from_stash(
            x, "RDEPENDS", ["${PN}", "class-target"]))

    depends = set(list(depends) + list(_depends))
    rdepends = set(list(rdepends) + list(_rdepends))
    return (depends, rdepends)


def save_variables(name, modifiers, oldrecipes):
    old_values = set()
    for x in oldrecipes:
        old_values.update(__get_info_from_stash(x, name, modifiers))
    return sorted(old_values)


def save_functions(oldrecipes):
    old_values = set()
    for x in oldrecipes:
        old_values.update([x.RealRaw for x in __get_raw_stash(x, Function.CLASSIFIER)])
    return sorted(old_values)


def save_export(oldrecipes):
    old_values = set()
    for x in oldrecipes:
        old_values.update([x.RealRaw for x in __get_raw_stash(x, Export.CLASSIFIER)])
    return sorted(old_values)

def save_unexpanded_var(name, oldrecipes):
    old_values = set()
    for x in oldrecipes:
        old_values.update([x.RealRaw for x in __get_raw_stash(x, Variable.CLASSIFIER) if x.VarName == name])
    return sorted(old_values)
