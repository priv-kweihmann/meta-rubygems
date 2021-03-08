# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tty-reader"
DESCRIPTION = "A set of methods for processing keyboard input in character, line and multiline modes"
HOMEPAGE = "https://ttytoolkit.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6adc4a015a61d9bf2e369197f18fb7a3"

DEPENDS_class-native += "\
    rubygems-tty-cursor-native \
    rubygems-tty-screen-native \
    rubygems-wisper-native \
"

SRC_URI[md5sum] = "c31a13e1210fb397e25fd9e115c5f8e0"
SRC_URI[sha256sum] = "c62972c985c0b1566f0e56743b6a7882f979d3dc32ff491ed490a076f899c2b1"

GEM_NAME = "tty-reader"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-tty-cursor \
    rubygems-tty-screen \
    rubygems-wisper \
"

BBCLASSEXTEND = "native"
