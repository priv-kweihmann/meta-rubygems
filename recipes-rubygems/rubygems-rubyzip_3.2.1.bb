# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubyzip"
DESCRIPTION = "rubyzip is a ruby module for reading and writing zip files"
HOMEPAGE = "http://github.com/rubyzip/rubyzip"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=132450ef8f45939b111e171e4b983632"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "99f3a2f833886fa8ba538727d8df9e15"
SRC_URI[sha256sum] = "a8e57709e47a36ba3d71921e9c636c711fff91b16c52adba8c1d6cac94ea512d"

GEM_NAME = "rubyzip"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
