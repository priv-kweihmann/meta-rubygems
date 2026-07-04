# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubyzip"
DESCRIPTION = "rubyzip is a ruby module for reading and writing zip files"
HOMEPAGE = "http://github.com/rubyzip/rubyzip"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=71270ccd875404f52a71e65c18eb9f88"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "56954b5cd63d7cecc6d04b2c504ed4a3"
SRC_URI[sha256sum] = "0a79e745b5c25872ebd148457df5665da8530ed8626c993b01457128f173ca02"

GEM_NAME = "rubyzip"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
