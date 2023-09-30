# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jsonpath"
DESCRIPTION = "Ruby implementation of http://goessner.net/articles/JsonPath/."
HOMEPAGE = "https://github.com/joshbuddy/jsonpath"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=61e5b5a2a5b2a078fae3d49784d640ce"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-multi-json-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "cfdf7c1aa57fba6f855dacd4bc943757"
SRC_URI[sha256sum] = "e1e3da6c2e02ce070ecc6e29e2da28f1f220469b074133abcc5694558e4d1e9f"

GEM_NAME = "jsonpath"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-multi-json \
"

BBCLASSEXTEND = "native"
