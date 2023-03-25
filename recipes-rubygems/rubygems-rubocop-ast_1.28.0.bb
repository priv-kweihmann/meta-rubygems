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

SRC_URI[md5sum] = "eba8268eb858d65e9643f3e4e1b6ea9a"
SRC_URI[sha256sum] = "051b5d53eb0840406d1b28a825087a6b4e8cc5dd1386887ec8f65cf39cd24f58"

GEM_NAME = "rubocop-ast"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-parser \
"

BBCLASSEXTEND = "native"
