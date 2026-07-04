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

SRC_URI[md5sum] = "0c551ef12f4b01aaf941ca12ff3f467d"
SRC_URI[sha256sum] = "75b11afa2edcee859b84c7a6972ee4456314eeef5f762827fd6cf5c5ffaf93f2"

GEM_NAME = "google-apis-storage_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
