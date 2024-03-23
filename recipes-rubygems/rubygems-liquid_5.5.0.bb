# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: liquid"
DESCRIPTION = "A secure, non-evaling end user template engine with aesthetic markup."
HOMEPAGE = "http://www.liquidmarkup.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f2a65a7b0b338ce2e5c688284735d982"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3fb32f72f0f802f0647eecc0676ac8be"
SRC_URI[sha256sum] = "b3f8591f7a4c29f7d13e654ddddcf94386e8cdbb0ea8cbf8523b22b584b18e38"

GEM_NAME = "liquid"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
