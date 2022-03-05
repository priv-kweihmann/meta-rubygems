# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: liquid"
DESCRIPTION = "A secure, non-evaling end user template engine with aesthetic markup."
HOMEPAGE = "http://www.liquidmarkup.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f2a65a7b0b338ce2e5c688284735d982"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3f9eef5ef832bc875384c8d0caac826d"
SRC_URI[sha256sum] = "815a09e27d9f1f96c0ab59b1c92947120d381022941c41172445d40df7fa5899"

GEM_NAME = "liquid"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
