# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubocop-ast"
DESCRIPTION = "RuboCop's Node and NodePattern classes."
HOMEPAGE = "https://www.rubocop.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=04ca7628e4fc69bcdd742603357bdfa6"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-ast-native \
    rubygems-parser-native \
    rubygems-prism-native \
    rubygems-racc-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2e7f4b1b0d1bca6e90bba9e4d0a754b6"
SRC_URI[sha256sum] = "11f7cadec54e593e905b1bb78f2b28bdd4b8e13b34cb82fe49c876e3dd5008c1"

GEM_NAME = "rubocop-ast"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ast \
    rubygems-parser \
    rubygems-prism \
    rubygems-racc \
"

BBCLASSEXTEND = "native"
