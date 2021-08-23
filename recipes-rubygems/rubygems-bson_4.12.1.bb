# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: bson"
DESCRIPTION = "A fully featured BSON specification implementation in Ruby"
HOMEPAGE = "https://docs.mongodb.com/ruby-driver/current/tutorials/bson-v4/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f48480fd251adc3a60549a0198f4727d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "6a13065fd0f89ec49fbd47255e743ecd"
SRC_URI[sha256sum] = "ecaad87506dbe0be2ae6b80d3d4788cd8e630ab7b842dc139ff03778cf02d95e"

GEM_NAME = "bson"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
