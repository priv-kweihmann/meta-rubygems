# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-struct"
DESCRIPTION = "Typed structs and value objects"
HOMEPAGE = "https://dry-rb.org/gems/dry-struct"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fe7086983f71ec803146164cfaaa1737"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-dry-core-native \
    rubygems-dry-types-native \
    rubygems-ice-nine-native \
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "06d532595a5c4323cf23ae326e089b7d"
SRC_URI[sha256sum] = "033868594c45241540172bf1ebbc8bb76b72b4f0717072325deba38ac13e80f1"

GEM_NAME = "dry-struct"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-dry-core \
    rubygems-dry-types \
    rubygems-ice-nine \
    rubygems-zeitwerk \
"

BBCLASSEXTEND = "native"
