# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: em-socksify"
DESCRIPTION = "Transparent proxy support for any EventMachine protocol"
HOMEPAGE = "https://github.com/igrigorik/em-socksify"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=82;endline=84;md5=32e813e72823d0d6b0103ae7bbff50bb"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-base64-native \
    rubygems-eventmachine-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b16b1eb845b2aa1c04070b8304d6d7ed"
SRC_URI[sha256sum] = "7d8d08a7a8acc1263173433a6b5540edd80a8a36e35a066b650c929a3a3974ed"

GEM_NAME = "em-socksify"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
    rubygems-eventmachine \
"

BBCLASSEXTEND = "native"
