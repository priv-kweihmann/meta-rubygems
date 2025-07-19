# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: thor"
DESCRIPTION = "Thor is a toolkit for building powerful command-line interfaces."
HOMEPAGE = "http://whatisthor.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=690cce21f4e069148a52834e1ecf352e"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2d2c0b9ba1c4e893cf43f44a55381b5d"
SRC_URI[sha256sum] = "8763e822ccb0f1d7bee88cde131b19a65606657b847cc7b7b4b82e772bcd8a3d"

GEM_NAME = "thor"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
