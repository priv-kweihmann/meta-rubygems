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

SRC_URI[md5sum] = "5558c53da82c8b97951629c4551cf98d"
SRC_URI[sha256sum] = "02acdd9b10d90c49e954efedb72d3d1a08e293aacf9c0e48f1e3c0e1995bc748"

GEM_NAME = "google-apis-compute_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
