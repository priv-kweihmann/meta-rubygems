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

SRC_URI[md5sum] = "64bc39a042f96670061e5e71d9457ab7"
SRC_URI[sha256sum] = "b9ca88300da0803ee222ad20cdb30494c0a784eed06fdc35d254b06d662788db"

GEM_NAME = "rubocop-ast"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-parser \
    rubygems-prism \
"

BBCLASSEXTEND = "native"
