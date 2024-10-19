# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-storage_v1"
DESCRIPTION = "This is the simple REST client for Cloud Storage JSON API V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5a45fb16ce54e618c54c58d87fe753d1"
SRC_URI[sha256sum] = "0c75864c5d9604dd6841ec9e0ea30c74d50f64e6329300ea435b34fce5f75278"

GEM_NAME = "google-apis-storage_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
