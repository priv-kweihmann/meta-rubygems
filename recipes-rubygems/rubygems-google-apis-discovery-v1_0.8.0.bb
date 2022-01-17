# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-discovery_v1"
DESCRIPTION = "This is the simple REST client for API Discovery Service V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5b77c69f7005e75f968bf12e8748393d"
SRC_URI[sha256sum] = "b48f60959a2cd7da81f7703f4b0cc9466488d8fd8b7828cb7a928e5cc6778d19"

GEM_NAME = "google-apis-discovery_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
