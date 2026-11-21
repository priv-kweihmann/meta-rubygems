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

SRC_URI[md5sum] = "9adb4818f912e194c561b78f9a15da97"
SRC_URI[sha256sum] = "404b448f4266998795b88edcd9f5dc51af798d8b3831cc6f60da5a1af8d5faa1"

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
