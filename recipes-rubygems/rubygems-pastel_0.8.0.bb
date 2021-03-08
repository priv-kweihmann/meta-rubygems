# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: pastel"
DESCRIPTION = "Terminal strings styling with intuitive and clean API."
HOMEPAGE = "https://ttytoolkit.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=51301a5886c31f0a5f89c467cb243c7f"

DEPENDS_class-native += "\
    rubygems-tty-color-native \
"

SRC_URI[md5sum] = "0b238cba4ecffadc6ef557c6803d5a01"
SRC_URI[sha256sum] = "481da9fb7d2f6e6b1a08faf11fa10363172dc40fd47848f096ae21209f805a75"

GEM_NAME = "pastel"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-tty-color \
"

BBCLASSEXTEND = "native"
