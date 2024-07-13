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

SRC_URI[md5sum] = "b904d0a5fb0d75fb6e0362d164336825"
SRC_URI[sha256sum] = "228b53b88e4811fe182c158100730409b468a27ec220ebd0d61e18b218a07e75"

GEM_NAME = "docker-api"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-excon \
    rubygems-multi-json \
"

BBCLASSEXTEND = "native"
