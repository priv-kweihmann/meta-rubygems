# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-types"
DESCRIPTION = "Type system for Ruby supporting coercions, constraints and complex types like structs, value objects, enums etc"
HOMEPAGE = "https://dry-rb.org/gems/dry-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fe7086983f71ec803146164cfaaa1737"

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

SRC_URI[md5sum] = "3b74f3b320ba4110892fea36e7a3a0b1"
SRC_URI[sha256sum] = "c52d3d6bdb0269fc299c44a7d9d5fcd736a63b393e2459b38728d9736b7df164"

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
