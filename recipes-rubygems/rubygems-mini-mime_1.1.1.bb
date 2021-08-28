# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mini_mime"
DESCRIPTION = "A lightweight mime type lookup toy"
HOMEPAGE = "https://github.com/discourse/mini_mime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4778dbd817e04a19ab6050d5e59bb853"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9a465e0e0d332b6d0104c6519ac8ab0e"
SRC_URI[sha256sum] = "d49f705f7d87721dd2aad2fa2787cd65ed5e2cefaa0d8495a13af48d37b96d9c"

GEM_NAME = "mini_mime"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
