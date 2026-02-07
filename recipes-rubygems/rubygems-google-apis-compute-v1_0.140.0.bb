# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-compute_v1"
DESCRIPTION = "This is the simple REST client for Compute Engine API V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "acf8a3fc937d18f6bf03b0a854352dea"
SRC_URI[sha256sum] = "f4fc9759a01750bf9a8589aa48266b7d552ffdc48263e10512024a71dbdfd819"

GEM_NAME = "google-apis-compute_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
