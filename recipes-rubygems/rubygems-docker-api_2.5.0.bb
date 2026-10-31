# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: docker-api"
DESCRIPTION = "A simple REST client for the Docker Remote API"
HOMEPAGE = "https://github.com/upserve/docker-api"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3f51ac9a2b4f16c3b23be5ed53a958aa"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-base64-native \
    rubygems-excon-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "30425f08c496b351fa8237bfdf4334bd"
SRC_URI[sha256sum] = "9d3b6646d50698156e5514fdba6c108054e1cc9d48bbef22415f9ab83af3e376"

GEM_NAME = "docker-api"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
    rubygems-excon \
"

BBCLASSEXTEND = "native"
