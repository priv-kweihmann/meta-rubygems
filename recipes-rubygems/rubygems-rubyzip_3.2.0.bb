# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubyzip"
DESCRIPTION = "rubyzip is a ruby module for reading and writing zip files"
HOMEPAGE = "http://github.com/rubyzip/rubyzip"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=132450ef8f45939b111e171e4b983632"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "605b647b633ecf9f7ab3695d26dfb023"
SRC_URI[sha256sum] = "7176c29319893374b235e42e309e5ef46049bfb07d20471ddde4c988f1dc2ccf"

GEM_NAME = "rubyzip"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
