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

SRC_URI[md5sum] = "ac6e38ee68998c3fda5e43c6cf1a2aef"
SRC_URI[sha256sum] = "57a14790ebee017d3d081ad5313b1a40802c0bde847a6a45ffa21d99d9aae039"

GEM_NAME = "google-apis-discovery_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
