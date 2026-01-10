# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-schema"
DESCRIPTION = "dry-schema provides a DSL for defining schemas with keys and rules that should be applied tovalues"
HOMEPAGE = "https://dry-rb.org/gems/dry-schema"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fe7086983f71ec803146164cfaaa1737"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-concurrent-ruby-native \
    rubygems-dry-configurable-native \
    rubygems-dry-core-native \
    rubygems-dry-initializer-native \
    rubygems-dry-logic-native \
    rubygems-dry-types-native \
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "856fb128d7d9bc4a7c0282fb06cf9d57"
SRC_URI[sha256sum] = "0f2a34adba4206bd6d46ec1b6b7691b402e198eecaff1d8349a7d48a77d82cd2"

GEM_NAME = "dry-schema"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-concurrent-ruby \
    rubygems-dry-configurable \
    rubygems-dry-core \
    rubygems-dry-initializer \
    rubygems-dry-logic \
    rubygems-dry-types \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"
