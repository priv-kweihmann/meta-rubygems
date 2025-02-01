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

SRC_URI[md5sum] = "0b24b6d3a6f3544f3a8fa17492d94e4d"
SRC_URI[sha256sum] = "c84e9ada69419c727c3b12e191e0ed7d2c6d58d040d55e79ea16e0ebf8b3ec0f"

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
