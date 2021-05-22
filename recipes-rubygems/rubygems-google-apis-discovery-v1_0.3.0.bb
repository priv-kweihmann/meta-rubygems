# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-discovery_v1"
DESCRIPTION = "This is the simple REST client for API Discovery Service V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

DEPENDS_class-native += "\
    rubygems-google-apis-core-native \
"

SRC_URI[md5sum] = "20a9649b3bc2a3d9d2526d83ff01ee48"
SRC_URI[sha256sum] = "ad8bf88b9ad12e6b10ca6f31a50b1cf71614e4048ce147c4c650046eb75b14e5"

GEM_NAME = "google-apis-discovery_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
