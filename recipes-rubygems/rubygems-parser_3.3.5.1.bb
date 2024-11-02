# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: parser"
DESCRIPTION = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=71edab539f93d7250a8c8399c77d3ad4"

EXTRA_DEPENDS:append = " \
    rubygems-gauntlet \
"
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-ast-native \
    rubygems-racc-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "61ad1bed8e9c8ea4b64e9b73dffc1415"
SRC_URI[sha256sum] = "b74c4403b8dd2ada9f72f9eae3b57f85ee82541ab4251736d39c25eede136c65"

GEM_NAME = "parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ast \
    rubygems-racc \
"

BBCLASSEXTEND = "native"
