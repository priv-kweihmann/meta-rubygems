# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: sassc"
DESCRIPTION = "Use libsass with Ruby!"
HOMEPAGE = "https://github.com/sass/sassc-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c4af8b2031d4dad9d1923cb8311870fc"

EXTRA_DEPENDS = "libsass"

DEPENDS_class-native += "\
    rubygems-ffi-native \
"

SRC_URI[md5sum] = "2f68401685a8be2a7ebb779620ec2a4d"
SRC_URI[sha256sum] = "4c60a2b0a3b36685c83b80d5789401c2f678c1652e3288315a1551d811d9f83e"

GEM_NAME = "sassc"

GEM_INSTALL_FLAGS += "\
    --disable-strip \
"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
