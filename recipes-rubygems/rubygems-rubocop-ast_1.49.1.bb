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
    rubygems-prism-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c99da21206b7515da190c50c547af197"
SRC_URI[sha256sum] = "4412f3ee70f6fe4546cc489548e0f6fcf76cafcfa80fa03af67098ffed755035"

GEM_NAME = "rubocop-ast"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-parser \
    rubygems-prism \
"

BBCLASSEXTEND = "native"
