# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: bson"
DESCRIPTION = "A fully featured BSON specification implementation in Ruby"
HOMEPAGE = "https://www.mongodb.com/docs/ruby-driver/current/tutorials/bson-v4/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f48480fd251adc3a60549a0198f4727d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d9175b22169a5baee1270b70ea0b0f51"
SRC_URI[sha256sum] = "8df40bededc42e4b990af6978cc923dc69355b9caf60a3d8d197e4c64ea851f3"

GEM_NAME = "bson"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
