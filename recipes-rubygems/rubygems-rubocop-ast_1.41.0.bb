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

SRC_URI[md5sum] = "7b27c8c1e9a60a24d3b5152c1eebfa1c"
SRC_URI[sha256sum] = "0eeff9ad3743f42823e3c687cbc15f8c552ff63c9f8e3d35fbafe746977c7c0d"

GEM_NAME = "rubocop-ast"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-parser \
"

BBCLASSEXTEND = "native"
