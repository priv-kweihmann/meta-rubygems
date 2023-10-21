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

SRC_URI[md5sum] = "9ae4be08c16884f940f236e370979597"
SRC_URI[sha256sum] = "29f70467193a2dc93ab864ec3d3326d54267961acc623f487340eb9c34931dbe"

GEM_NAME = "jsonpath"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-multi-json \
"

BBCLASSEXTEND = "native"
