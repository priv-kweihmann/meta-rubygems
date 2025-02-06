# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: bindata"
DESCRIPTION = "BinData is a declarative way to read and write binary file formats."
HOMEPAGE = "https://github.com/dmendel/bindata"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61b188c157f57c801173844363bb013d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c893016c3b689893b033e12536faeeab"
SRC_URI[sha256sum] = "29dccb8ba1cc9de148f24bb88930840c62db56715f0f80eccadd624d9f3d2623"

GEM_NAME = "bindata"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
