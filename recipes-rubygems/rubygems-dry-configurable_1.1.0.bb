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

SRC_URI[md5sum] = "598bfc68bcf42c28ba06bd94d800f4b8"
SRC_URI[sha256sum] = "dd7449cfcde4b1b99ff7ef6da87df273128f19a58c2d97fb6405f97cb22fb7da"

GEM_NAME = "dry-configurable"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-dry-core \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"
