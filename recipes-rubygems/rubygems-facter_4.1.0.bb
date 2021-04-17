# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: facter"
DESCRIPTION = "New version of Facter"
HOMEPAGE = "https://github.com/puppetlabs/facter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
"

DEPENDS_class-native += "\
    rubygems-hocon-native \
    rubygems-thor-native \
"

SRC_URI[md5sum] = "508055b1781d3c694902ca876022dc73"
SRC_URI[sha256sum] = "1b71b799fe6403c76c653d4d8d6d2685b84d63dad4c469d1dc904e38eb07df83"

GEM_NAME = "facter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-hocon \
    rubygems-thor \
"

BBCLASSEXTEND = "native"
