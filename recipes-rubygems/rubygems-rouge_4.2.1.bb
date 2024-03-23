# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rouge"
DESCRIPTION = "Rouge aims to a be a simple, easy-to-extend drop-in replacement for pygments."
HOMEPAGE = "http://rouge.jneen.net/"

LICENSE = "MIT & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=548cf784d6d431718abbb22a2eb5cdbe"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "21d68cb60f14d8402e1884671f14779a"
SRC_URI[sha256sum] = "f371732db127913fe10f13b1c25500b927539167a746dc8ee8089ad868bba1fd"

GEM_NAME = "rouge"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
