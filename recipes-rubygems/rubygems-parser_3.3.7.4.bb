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

SRC_URI[md5sum] = "78503998f6d30c2c68b64b56aba200ae"
SRC_URI[sha256sum] = "2b26282274280e13f891080dc4ef3f65ce658d62e13255b246b28ec6754e98ab"

GEM_NAME = "parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ast \
    rubygems-racc \
"

BBCLASSEXTEND = "native"
