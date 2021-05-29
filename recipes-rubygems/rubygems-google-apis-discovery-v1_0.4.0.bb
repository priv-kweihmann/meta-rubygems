# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-discovery_v1"
DESCRIPTION = "This is the simple REST client for API Discovery Service V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

DEPENDS_class-native += "\
    rubygems-google-apis-core-native \
"

SRC_URI[md5sum] = "9ba7ed271b98c34a1ca557243d6a4536"
SRC_URI[sha256sum] = "50b418352b7170fbfbfc249e8309065fb28d426ea10dc248bcfe2696646e5f1d"

GEM_NAME = "google-apis-discovery_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
