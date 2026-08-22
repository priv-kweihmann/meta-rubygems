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

SRC_URI[md5sum] = "dc9809fd1c7f8a101eeee40878f74f41"
SRC_URI[sha256sum] = "fdf6d65d3fc77e7046b3494333a818ece9e2afd763bb161e1a7a9e70cf198351"

GEM_NAME = "google-apis-storage_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
