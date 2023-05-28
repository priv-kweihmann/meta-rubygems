# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-configurable"
DESCRIPTION = "A mixin to add configuration functionality to your classes"
HOMEPAGE = "https://dry-rb.org/gems/dry-configurable"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94642341bb0f18ae40ee66ef498a2777"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-dry-core-native \
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "86d2078596a5b65a2b566fca59821dc6"
SRC_URI[sha256sum] = "4c876f2ff35c0e8bc54efc24a5a93972e1907a1221fccdfb528adc9fc2eb5af1"

GEM_NAME = "dry-configurable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-dry-core \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"
