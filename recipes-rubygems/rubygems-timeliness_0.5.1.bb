# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: timeliness"
DESCRIPTION = "Fast date/time parser with customisable formats, timezone and I18n support."
HOMEPAGE = "http://github.com/adzap/timeliness"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd0d5f39027b1293d8d7f034905de138"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7a287cfc9909fcd181ce3827c419dd6c"
SRC_URI[sha256sum] = "1884b6b63c7030145121f794b078251e330d86c2d7eb4fe69602c8a98b5a83b3"

GEM_NAME = "timeliness"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
