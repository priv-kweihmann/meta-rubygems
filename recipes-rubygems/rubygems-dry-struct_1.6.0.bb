# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-struct"
DESCRIPTION = "Typed structs and value objects"
HOMEPAGE = "https://dry-rb.org/gems/dry-struct"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94642341bb0f18ae40ee66ef498a2777"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-dry-core-native \
    rubygems-dry-types-native \
    rubygems-ice-nine-native \
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2a8e8e271c9455d600421427d9b764e7"
SRC_URI[sha256sum] = "3737025b3a6cd50fd4e6f42883cbb8d5e0d07680bc8310f7dc0db8c8897dd4e6"

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
