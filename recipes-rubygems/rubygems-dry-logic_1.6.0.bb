# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-logic"
DESCRIPTION = "Predicate logic with rule composition"
HOMEPAGE = "https://dry-rb.org/gems/dry-logic"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b14b1929847ba471f3f59da600744315"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-bigdecimal-native \
    rubygems-concurrent-ruby-native \
    rubygems-dry-core-native \
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "8931ddc947e3af4f82c25d69a8c9b5b4"
SRC_URI[sha256sum] = "da6fedbc0f90fc41f9b0cc7e6f05f5d529d1efaef6c8dcc8e0733f685745cea2"

GEM_NAME = "dry-logic"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-bigdecimal \
    rubygems-concurrent-ruby \
    rubygems-dry-core \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"
