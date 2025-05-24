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

SRC_URI[md5sum] = "5ad64be9bffa45c062871b831f68f34e"
SRC_URI[sha256sum] = "3d82dde8f8d94ecca40592daf831959a7d622a3c33048c81daf3c0d9226f6a7e"

GEM_NAME = "google-apis-monitoring_v3"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
