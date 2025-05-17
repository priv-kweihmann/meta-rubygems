# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: timeliness"
DESCRIPTION = "Fast date/time parser with customisable formats, timezone and I18n support."
HOMEPAGE = "http://github.com/adzap/timeliness"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd0d5f39027b1293d8d7f034905de138"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c3d26a12c3a1cce443ad73f8f3bfd4cc"
SRC_URI[sha256sum] = "6175e14a0e072b50d2433d253de3c18ce10c573d909edf55c4b510271ecd5aed"

GEM_NAME = "timeliness"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
