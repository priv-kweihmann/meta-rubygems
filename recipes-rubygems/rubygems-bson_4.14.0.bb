# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: bson"
DESCRIPTION = "A fully featured BSON specification implementation in Ruby"
HOMEPAGE = "https://docs.mongodb.com/ruby-driver/current/tutorials/bson-v4/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f48480fd251adc3a60549a0198f4727d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b218860499cdb7dd341fda3fb82c819d"
SRC_URI[sha256sum] = "eeb1ca15afb230db9f3af898982df38f1b2fb734d106a651ed829484dac7dc6d"

GEM_NAME = "bson"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
