# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: docker-api"
DESCRIPTION = "A simple REST client for the Docker Remote API"
HOMEPAGE = "https://github.com/swipely/docker-api"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3f51ac9a2b4f16c3b23be5ed53a958aa"

DEPENDS:class-native += "\
    rubygems-excon-native \
    rubygems-multi-json-native \
"

SRC_URI[md5sum] = "3809e11562816a421e38030ddbe50ad4"
SRC_URI[sha256sum] = "be2b7ef6462080fbbc5ee3f5e1ae9725379412900076e3b5a06395f0a35ded3c"

GEM_NAME = "docker-api"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-excon \
    rubygems-multi-json \
"

BBCLASSEXTEND = "native"
