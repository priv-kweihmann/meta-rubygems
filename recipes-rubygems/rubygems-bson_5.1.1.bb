# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: bson"
DESCRIPTION = "A fully featured BSON specification implementation in Ruby"
HOMEPAGE = "https://www.mongodb.com/docs/ruby-driver/current/tutorials/bson-v4/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f48480fd251adc3a60549a0198f4727d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "34125bbd91a49b29fa0fb4f7535e6402"
SRC_URI[sha256sum] = "a57c490c6a6a0618872d5158527e426057341acf0508cf1bc3a1c7615249060b"

GEM_NAME = "bson"

inherit rubygems
inherit rubygentest
inherit pkgconfig

INSANE_SKIP:${PN} += "rpaths"

BBCLASSEXTEND = "native"
