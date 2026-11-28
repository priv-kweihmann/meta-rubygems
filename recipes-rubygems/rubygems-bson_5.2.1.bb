# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: bson"
DESCRIPTION = "A fully featured BSON specification implementation in Ruby"
HOMEPAGE = "https://www.mongodb.com/docs/ruby-driver/current/tutorials/bson-v4/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f48480fd251adc3a60549a0198f4727d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-base64-native \
    rubygems-bigdecimal-native \
    rubygems-ostruct-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f241927d136bafbd35bf7a163fa87a9f"
SRC_URI[sha256sum] = "7cef822f8ab921f071473d2343112d61e97e6294e125143d8dd5f025e4d13b8c"

GEM_NAME = "bson"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
    rubygems-bigdecimal \
    rubygems-ostruct \
"

INSANE_SKIP:${PN} += "rpaths"

BBCLASSEXTEND = "native"
