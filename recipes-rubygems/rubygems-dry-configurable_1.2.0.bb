# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-configurable"
DESCRIPTION = "A mixin to add configuration functionality to your classes"
HOMEPAGE = "https://dry-rb.org/gems/dry-configurable"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b14b1929847ba471f3f59da600744315"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-dry-core-native \
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7c401f4a1c8942c72f2f35250bb3920c"
SRC_URI[sha256sum] = "3d3b6e2f5b96853f906de62a27307463d39cc4a2d2a1999b8f47fe34b8bee4fa"

GEM_NAME = "dry-configurable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-dry-core \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"
