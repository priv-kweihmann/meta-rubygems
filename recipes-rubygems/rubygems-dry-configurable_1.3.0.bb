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

SRC_URI[md5sum] = "6801db3941248b79d5f4ff2c2491e844"
SRC_URI[sha256sum] = "882d862858567fc1210d2549d4c090f34370fc1bb7c5c1933de3fe792e18afa8"

GEM_NAME = "dry-configurable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-dry-core \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"
