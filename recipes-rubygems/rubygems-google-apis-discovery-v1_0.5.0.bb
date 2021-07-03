# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-discovery_v1"
DESCRIPTION = "This is the simple REST client for API Discovery Service V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

DEPENDS_class-native += "\
    rubygems-google-apis-core-native \
"

SRC_URI[md5sum] = "9c3f72212576f64d5e3394f57f205726"
SRC_URI[sha256sum] = "64700d2245cfcc3592b19ac0df14a39ca1eecc86078733b0cb71bec29e729ebe"

GEM_NAME = "google-apis-discovery_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
