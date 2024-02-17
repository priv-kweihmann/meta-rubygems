# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: em-socksify"
DESCRIPTION = "Transparent proxy support for any EventMachine protocol"
HOMEPAGE = "https://github.com/igrigorik/em-socksify"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=8f9eacbf0a28499f2fd428d038e4f803"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-eventmachine-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d6f693ae7b9926ce857d4e7b5d067e76"
SRC_URI[sha256sum] = "d39656c6d1e11de4390b49484a0ff5fd8add0f12283580026ad959a5b81f6466"

GEM_NAME = "em-socksify"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-eventmachine \
"

BBCLASSEXTEND = "native"
