# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-types"
DESCRIPTION = "Type system for Ruby supporting coercions, constraints and complex types like structs, value objects, enums etc"
HOMEPAGE = "https://dry-rb.org/gems/dry-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b14b1929847ba471f3f59da600744315"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-concurrent-ruby-native \
    rubygems-dry-core-native \
    rubygems-dry-inflector-native \
    rubygems-dry-logic-native \
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "81d28155931a33af98e06201ea5086fd"
SRC_URI[sha256sum] = "12165841145a18dd22151f143707b90c8093f71e5ae06ee0f2301f5321f8cdb8"

GEM_NAME = "dry-types"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-concurrent-ruby \
    rubygems-dry-core \
    rubygems-dry-inflector \
    rubygems-dry-logic \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"
