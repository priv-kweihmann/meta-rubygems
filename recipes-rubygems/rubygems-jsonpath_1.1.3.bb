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

SRC_URI[md5sum] = "1e6f6609b7bcdd53443f9bb9a8ca92f6"
SRC_URI[sha256sum] = "57feb68cd05f2828bc28720e3592c36fec31d418bca967fbfcd3dd0c286b31c4"

GEM_NAME = "jsonpath"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-multi-json \
"

BBCLASSEXTEND = "native"
