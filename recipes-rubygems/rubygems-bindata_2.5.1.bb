# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: bindata"
DESCRIPTION = "BinData is a declarative way to read and write binary file formats.This means the programmer specifies *what* the format of the binarydata is, and BinData works out *how* to read and write data in thisformat"
HOMEPAGE = "https://github.com/dmendel/bindata"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61b188c157f57c801173844363bb013d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d5929e59e78b22f9f22c61386b584368"
SRC_URI[sha256sum] = "53186a1ec2da943d4cb413583d680644eb810aacbf8902497aac8f191fad9e58"

GEM_NAME = "bindata"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
