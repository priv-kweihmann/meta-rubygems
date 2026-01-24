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

SRC_URI[md5sum] = "d29dc4cb2e927183081a95074c8796d2"
SRC_URI[sha256sum] = "aa176ebf131c8e382692e5b56c3019596c630ec86caedbc9fe7028c7e78cf538"

GEM_NAME = "google-apis-storage_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
