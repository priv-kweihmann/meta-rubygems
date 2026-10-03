# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: bindata"
DESCRIPTION = "BinData is a declarative way to read and write binary file formats.This means the programmer specifies *what* the format of the binarydata is, and BinData works out *how* to read and write data in thisformat"
HOMEPAGE = "https://github.com/dmendel/bindata"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d8c951d6cdf945869e89d017bd525e13"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "6c17d151638ff86953f259b881e034a3"
SRC_URI[sha256sum] = "e97a826a12f6e7c5847e983e5826f277d61035317d352ec339b079537f2fa466"

GEM_NAME = "bindata"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
