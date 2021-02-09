# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tty-table"
DESCRIPTION = "A flexible and intuitive table generator"
HOMEPAGE = "https://ttytoolkit.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ccb3f6c9399ae36f003ef2debf871be1"

DEPENDS_class-native += "\
    rubygems-pastel-native \
    rubygems-strings-native \
    rubygems-tty-screen-native \
"
RDEPENDS_${PN}_class-target += "\
    rubygems-pastel \
    rubygems-strings \
    rubygems-tty-screen \
"

SRC_URI[md5sum] = "51f7a63dd235ce9e1508dc9cfeaa7d90"
SRC_URI[sha256sum] = "fdc27a4750835c1a16efe19a0b857e3ced3652cc7aceafe6dca94908965b9939"

GEM_NAME = "tty-table"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
