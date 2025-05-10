# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-compute_v1"
DESCRIPTION = "This is the simple REST client for Compute Engine API V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "6591ba32e25b0cb12c5cacd45c307c38"
SRC_URI[sha256sum] = "18498a6c9916d95ec4c952255db41fcb669804d09b6d3bd7c316dd0eec79f89c"

GEM_NAME = "google-apis-compute_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
