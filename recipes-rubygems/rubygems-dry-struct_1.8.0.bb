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

SRC_URI[md5sum] = "86512552c42965f7ca2cdaad01005b58"
SRC_URI[sha256sum] = "74c38b559924fb6462ac43ec780c4533a082d7b1d238a8d7857b773b3b8e2966"

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
