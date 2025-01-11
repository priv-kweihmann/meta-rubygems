# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-struct"
DESCRIPTION = "Typed structs and value objects"
HOMEPAGE = "https://dry-rb.org/gems/dry-struct"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b14b1929847ba471f3f59da600744315"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-dry-core-native \
    rubygems-dry-types-native \
    rubygems-ice-nine-native \
    rubygems-zeitwerk-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "42d6d4ece0367c28c7e6500195f35e5c"
SRC_URI[sha256sum] = "8c8b6eb8da570e8b7fde9fb080591f3ca79b4d97f03d2ffd87a0336138152ba5"

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
