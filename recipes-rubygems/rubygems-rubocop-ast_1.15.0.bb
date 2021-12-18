# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubocop-ast"
DESCRIPTION = "RuboCop's Node and NodePattern classes."
HOMEPAGE = "https://www.rubocop.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=04ca7628e4fc69bcdd742603357bdfa6"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-parser-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "620d9f824f4e38b2d8c6cd1492f99487"
SRC_URI[sha256sum] = "2e0b166f425a5f2778809f36a6f2f7a645a8182f9454cee63d6e9040e8bd482e"

GEM_NAME = "rubocop-ast"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-parser \
"

BBCLASSEXTEND = "native"
