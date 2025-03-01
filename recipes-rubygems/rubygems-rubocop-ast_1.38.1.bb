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

SRC_URI[md5sum] = "a4ae9737983a287284b58bb6ff673efa"
SRC_URI[sha256sum] = "80ecbe2ac9bb26693cab9405bf72b41b85a1f909f20f021b983c32c2e7d857fe"

GEM_NAME = "rubocop-ast"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-parser \
"

BBCLASSEXTEND = "native"
