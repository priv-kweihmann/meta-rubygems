# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: docker-api"
DESCRIPTION = "A simple REST client for the Docker Remote API"
HOMEPAGE = "https://github.com/swipely/docker-api"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3f51ac9a2b4f16c3b23be5ed53a958aa"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-excon-native \
    rubygems-multi-json-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0664c1aed27df093b2a76b6277b30777"
SRC_URI[sha256sum] = "824be734f4cc8718189be9c8e795b6414acbbf7e8b082a06f959a27dd8dd63e6"

GEM_NAME = "docker-api"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-excon \
    rubygems-multi-json \
"

BBCLASSEXTEND = "native"
