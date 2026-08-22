# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tilt"
DESCRIPTION = "Generic interface to multiple Ruby template engines"
HOMEPAGE = "https://github.com/jeremyevans/tilt"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=4bae9ae09b7db25e5d6097cfb45bdcc0"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c04d86b0359e05a03c0e0db57dba6000"
SRC_URI[sha256sum] = "da5735d0280bba96e9a91041bb14aee435ccad5c17b0fa519249ae543d9aa3a5"

GEM_NAME = "tilt"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
