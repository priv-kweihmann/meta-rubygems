# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-cloudresourcemanager_v1"
DESCRIPTION = "This is the simple REST client for Cloud Resource Manager API V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "53b29cf52f33de0b2c5d8b933458d9e4"
SRC_URI[sha256sum] = "6efd35ebc4f7d2b33e8857ba2f9d1567ddd660ea30651fd458ece00da0685f07"

GEM_NAME = "google-apis-cloudresourcemanager_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
