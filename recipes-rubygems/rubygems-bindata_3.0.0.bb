# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: bindata"
DESCRIPTION = "BinData is a declarative way to read and write binary file formats.This means the programmer specifies *what* the format of the binarydata is, and BinData works out *how* to read and write data in thisformat"
HOMEPAGE = "https://github.com/dmendel/bindata"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d8c951d6cdf945869e89d017bd525e13"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ded0dfed567794a569c21c852cf9d787"
SRC_URI[sha256sum] = "7edc84092f958326ea1a3207142c79ba9f6b53796a02098a5b1670be75bd8a79"

GEM_NAME = "bindata"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
