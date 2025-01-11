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

SRC_URI[md5sum] = "c2950fa048dd4bfe45175bcb4c96fde8"
SRC_URI[sha256sum] = "ec40615e122040597cbb2f286b237f59a8f1f558e0071250788a53c125f742a9"

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
