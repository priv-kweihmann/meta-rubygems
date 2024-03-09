# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: childprocess"
DESCRIPTION = "This gem aims at being a simple and reliable solution for controlling external programs running in the background on any Ruby / OS combination."
HOMEPAGE = "https://github.com/enkessler/childprocess"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d3ab41b7c43688b785f7e436543ec593"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b32c079b3d16cf0651d0b3dea6e17c2d"
SRC_URI[sha256sum] = "0746b7ab1d6c68156e64a3767631d7124121516192c0492929a7f0af7310d835"

GEM_NAME = "childprocess"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
