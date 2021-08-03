# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: axiom-types"
DESCRIPTION = "Define types with optional constraints for use within axiom and other libraries."
HOMEPAGE = "https://github.com/dkubb/axiom-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bb2f5305df40093372eea3bbf265a14c"

DEPENDS:class-native += "\
    rubygems-descendants-tracker-native \
    rubygems-ice-nine-native \
    rubygems-thread-safe-native \
"

SRC_URI[md5sum] = "728d702cf0f3f31b49b41a4019afba56"
SRC_URI[sha256sum] = "c1ff113f3de516fa195b2db7e0a9a95fd1b08475a502ff660d04507a09980383"

GEM_NAME = "axiom-types"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-descendants-tracker \
    rubygems-ice-nine \
    rubygems-thread-safe \
"

BBCLASSEXTEND = "native"
