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

SRC_URI[md5sum] = "7044a05a7f92a58f6c1b286143503435"
SRC_URI[sha256sum] = "40201e861c73a3c2d59428c7627828ef81fb2f8a306bc4a1c1801452afe3fe0f"

GEM_NAME = "rubocop-ast"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-parser \
"

BBCLASSEXTEND = "native"
