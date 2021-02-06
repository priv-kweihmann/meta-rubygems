# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: facter"
DESCRIPTION = "New version of Facter"
HOMEPAGE = "None"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://TODO;md5=abcdef"

DEPENDS_class-native += "\
    rubygems-hocon-native \
    rubygems-thor-native \
"
RDEPENDS_${PN}_class-target += "\
    rubygems-hocon \
    rubygems-thor \
"

SRC_URI[md5sum] = "ad22c19aa44cab5a3a97c2fbc5e87423"
SRC_URI[sha256sum] = "2f75e2f9f69f26594afc56a12be28efbaee88067cbbb333be4d6453db6eebf3d"

GEM_NAME = "facter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
