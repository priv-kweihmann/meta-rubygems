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

SRC_URI[md5sum] = "4ca98e2f9cfc801db707c0b358edf6e1"
SRC_URI[sha256sum] = "4200913a24a36932d531d726a00067f727b4bd03d511d267f58ba3a86bee53ae"

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
