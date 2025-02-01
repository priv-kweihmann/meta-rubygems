# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: timeliness"
DESCRIPTION = "Fast date/time parser with customisable formats, timezone and I18n support."
HOMEPAGE = "http://github.com/adzap/timeliness"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd0d5f39027b1293d8d7f034905de138"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5d13fc819150a38441bf919cbf349746"
SRC_URI[sha256sum] = "be8956d90570027c23a0852e03bfd5e92d9e7f74d966f97c4685ec62059eba50"

GEM_NAME = "timeliness"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
