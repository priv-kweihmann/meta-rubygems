# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: net-ftp"
DESCRIPTION = "Support for the File Transfer Protocol."
HOMEPAGE = "https://github.com/ruby/net-ftp"

LICENSE = "Ruby & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5"

DEPENDS_class-native += "\
    rubygems-net-protocol-native \
    rubygems-time-native \
"

SRC_URI[md5sum] = "f66492b390b32cfc50c5d375f74f4d3c"
SRC_URI[sha256sum] = "34ce5f19f7415b068aa9b63bd891c4691759744f39107cec73a49009c04aa0bf"

GEM_NAME = "net-ftp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-net-protocol \
    rubygems-time \
"

BBCLASSEXTEND = "native"
