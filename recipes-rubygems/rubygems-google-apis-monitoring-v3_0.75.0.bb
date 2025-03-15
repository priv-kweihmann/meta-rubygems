# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-monitoring_v3"
DESCRIPTION = "This is the simple REST client for Cloud Monitoring API V3"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9d45d90b0f0ea848fd0f857bf80d79fa"
SRC_URI[sha256sum] = "ebdaf26293376bb81fe8df4a966ac04c60e467cfc7d7479892ba0aae89a4f058"

GEM_NAME = "google-apis-monitoring_v3"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
