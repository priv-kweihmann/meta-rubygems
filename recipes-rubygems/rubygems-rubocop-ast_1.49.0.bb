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

SRC_URI[md5sum] = "c0a2c1882965e5cad217010347a6a185"
SRC_URI[sha256sum] = "49c3676d3123a0923d333e20c6c2dbaaae2d2287b475273fddee0c61da9f71fd"

GEM_NAME = "rubocop-ast"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-parser \
    rubygems-prism \
"

BBCLASSEXTEND = "native"
