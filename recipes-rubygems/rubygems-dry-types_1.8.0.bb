# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-types"
DESCRIPTION = "Type system for Ruby supporting coercions, constraints and complex types like structs, value objects, enums etc"
HOMEPAGE = "https://dry-rb.org/gems/dry-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b14b1929847ba471f3f59da600744315"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-bigdecimal-native \
    rubygems-concurrent-ruby-native \
    rubygems-dry-core-native \
    rubygems-dry-inflector-native \
    rubygems-dry-logic-native \
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "218e63f0c86ffc01e55ea6b07aad41e5"
SRC_URI[sha256sum] = "bdf444e0d2ff83f500271c7d38cb29690c2654fa78e588f68349a7b1e7341131"

GEM_NAME = "dry-types"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-bigdecimal \
    rubygems-concurrent-ruby \
    rubygems-dry-core \
    rubygems-dry-inflector \
    rubygems-dry-logic \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"