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

SRC_URI[md5sum] = "2ded5ce03dbb251e200ead7889cc248f"
SRC_URI[sha256sum] = "baebeecdb9f8395d6c9d227b62011279440943e3ef2468fe8ccc1ba11467f178"

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
