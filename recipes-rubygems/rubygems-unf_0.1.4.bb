# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: unf"
DESCRIPTION = "This is a wrapper library to bring Unicode Normalization Form supportto Ruby/JRuby."
HOMEPAGE = "https://github.com/knu/ruby-unf"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f82c6dbc2ac1850fd92347bda995df43"

DEPENDS:class-native += "\
    rubygems-unf-ext-native \
"

SRC_URI[md5sum] = "64009f92a131c50bc1a932dc50d562c6"
SRC_URI[sha256sum] = "4999517a531f2a955750f8831941891f6158498ec9b6cb1c81ce89388e63022e"

GEM_NAME = "unf"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-unf-ext \
"

BBCLASSEXTEND = "native"
