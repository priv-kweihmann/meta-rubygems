# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: childprocess"
DESCRIPTION = "This gem aims at being a simple and reliable solution for controlling external programs running in the background on any Ruby / OS combination."
HOMEPAGE = "https://github.com/enkessler/childprocess"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d3ab41b7c43688b785f7e436543ec593"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-logger-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "8ca074e79409523c3c699648d7432303"
SRC_URI[sha256sum] = "9a8d484be2fd4096a0e90a0cd3e449a05bc3aa33f8ac9e4d6dcef6ac1455b6ec"

GEM_NAME = "childprocess"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-logger \
"

BBCLASSEXTEND = "native"
