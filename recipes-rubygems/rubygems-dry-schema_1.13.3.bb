# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-schema"
DESCRIPTION = "dry-schema provides a DSL for defining schemas with keys and rules that should be applied tovalues"
HOMEPAGE = "https://dry-rb.org/gems/dry-schema"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b14b1929847ba471f3f59da600744315"

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

SRC_URI[md5sum] = "dc5e1d1a7678402456d1aab715363ee0"
SRC_URI[sha256sum] = "ff0ec847c7986ddb76145f9426ddacaa68c28b170c0f626fb8d30fcb431393e3"

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
