# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: timeliness"
DESCRIPTION = "Fast date/time parser with customisable formats, timezone and I18n support."
HOMEPAGE = "http://github.com/adzap/timeliness"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd0d5f39027b1293d8d7f034905de138"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "6b7371eb193eb5c75fc439a916a582e3"
SRC_URI[sha256sum] = "8018a4a632ae3ab1b4f8da54711e8934e92d7a4d68ee13ce8311e752afcf6149"

GEM_NAME = "timeliness"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
