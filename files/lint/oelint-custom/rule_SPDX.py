from oelint_adv.cls_rule import Rule
from oelint_parser.cls_item import Comment


class RubygemsSPDX(Rule):

    def __init__(self):
        super().__init__(id="rubygems.spdxheader",
                         severity="error",
                         message="Please add an 'SPDX-License-Identifier: MIT' comment to the file")

    def check(self, _file, stash):
        res = []
        if "recipes-rubygems/" not in _file:
            return []
        items = stash.GetItemsFor(
            filename=_file, classifier=Comment.CLASSIFIER)
        found = any(x for x in items if "SPDX-License-Identifier: MIT" in x.Raw)
        if not found:
            res += self.finding(_file, 1)
        return res
