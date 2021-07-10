# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-discovery_v1"
DESCRIPTION = "This is the simple REST client for API Discovery Service V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

DEPENDS_class-native += "\
    rubygems-google-apis-core-native \
"

SRC_URI[md5sum] = "af56a1497782fc4a8d80838c71e0dbfc"
SRC_URI[sha256sum] = "4a258742fd2136a54dbe4db2e0b1757b4a49250ed3a78f9dda45034b4bde9dbf"

GEM_NAME = "google-apis-discovery_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
