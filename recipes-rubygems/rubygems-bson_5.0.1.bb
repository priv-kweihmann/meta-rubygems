# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: bson"
DESCRIPTION = "A fully featured BSON specification implementation in Ruby"
HOMEPAGE = "https://www.mongodb.com/docs/ruby-driver/current/tutorials/bson-v4/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f48480fd251adc3a60549a0198f4727d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c55039e3e0467616cae9f04f836c6954"
SRC_URI[sha256sum] = "5781d19ae352fe0d3078eed9ae3305504b87aafe0cc4ee57343b2f986fa9ffa5"

GEM_NAME = "bson"

inherit rubygems
inherit rubygentest
inherit pkgconfig

# The vendored library is causing some rpath issues
INSANE_SKIP:${PN} += "rpaths"

BBCLASSEXTEND = "native"
