# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-generator"
DESCRIPTION = "Code generator for legacy Google REST clients"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

DEPENDS_class-native += "\
    rubygems-activesupport-native \
    rubygems-gems-native \
    rubygems-google-apis-core-native \
    rubygems-google-apis-discovery-v1-native \
    rubygems-thor-native \
"

SRC_URI[md5sum] = "12bd10f3f70b71bb0d2c500e74c3e5c4"
SRC_URI[sha256sum] = "f7078384e265caffbd1e9f295951c74fd5f022d5f9fd5158c775db2e59c74f6e"

GEM_NAME = "google-apis-generator"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-activesupport \
    rubygems-gems \
    rubygems-google-apis-core \
    rubygems-google-apis-discovery-v1 \
    rubygems-thor \
"

BBCLASSEXTEND = "native"
