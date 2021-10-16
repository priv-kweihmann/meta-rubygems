# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mini_mime"
DESCRIPTION = "A lightweight mime type lookup toy"
HOMEPAGE = "https://github.com/discourse/mini_mime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4778dbd817e04a19ab6050d5e59bb853"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "cb193cf2badd9a85d884cd83556523b6"
SRC_URI[sha256sum] = "a54aec0cc7438a03a850adb00daca2bdb60747f839e28186994df057cea87151"

GEM_NAME = "mini_mime"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
