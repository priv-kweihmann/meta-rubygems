# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: faraday_middleware"
DESCRIPTION = "Various middleware for Faraday"
HOMEPAGE = "https://github.com/lostisland/faraday_middleware"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=a59d0c4589d25cc5037028f3465378d6"

DEPENDS:class-native += "\
    rubygems-faraday-native \
"

SRC_URI[md5sum] = "651322519b2b961bf27f78bf54fe8f92"
SRC_URI[sha256sum] = "442288d81bdb48dccadf5463e256582850a2cc654ef5cd281f941c7b1cbcec4d"

GEM_NAME = "faraday_middleware"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
