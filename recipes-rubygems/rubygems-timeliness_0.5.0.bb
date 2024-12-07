# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: timeliness"
DESCRIPTION = "Fast date/time parser with customisable formats, timezone and I18n support."
HOMEPAGE = "http://github.com/adzap/timeliness"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd0d5f39027b1293d8d7f034905de138"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "08ee43bbb6b671bb894fd99dfba9ddad"
SRC_URI[sha256sum] = "adfc794c3633a8da5748e895ab648c3a5e60e40c1f13c52deec5400fd7b1e47b"

GEM_NAME = "timeliness"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
