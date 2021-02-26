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

SRC_URI[md5sum] = "d8088a901f508ffd8652508500a94924"
SRC_URI[sha256sum] = "89b782fddd6ae98e400858a50e9f5f2adf6ad8607eb06a7b1ee4759b70ca6b82"

GEM_NAME = "facter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-hocon \
    rubygems-thor \
"

BBCLASSEXTEND = "native"
