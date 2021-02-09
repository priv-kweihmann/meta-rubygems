import os

from oelint_adv.cls_rule import Rule
from oelint_parser.helper_files import expand_term
from oelint_parser.helper_files import get_layer_root


class RubygemsPackageGroup(Rule):

    PACKAGEGROUP_PATH = "packagegroups-rubygems/packagegroup-rubygems.bb"

    def __init__(self):
        super().__init__(id="rubygems.packagegroup",
                         severity="error",
                         message="Recipe has to be part of the 'packagegroup-rubygems.bb'")

    def check(self, _file, stash):
        res = []
        _pn = expand_term(stash, _file, "${PN}")
        _layer_root = get_layer_root(_file)
        _path = os.path.join(
            _layer_root, RubygemsPackageGroup.PACKAGEGROUP_PATH)
        if os.path.exists(_path):
            with open(_path) as i:
                if _pn not in i.read():
                    res += self.finding(_file, 1)
        return res
