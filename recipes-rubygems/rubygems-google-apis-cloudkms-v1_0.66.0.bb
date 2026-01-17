# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-cloudkms_v1"
DESCRIPTION = "This is the simple REST client for Cloud Key Management Service (KMS) API V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b3438ea439dcd6850b3f48c26a582605"
SRC_URI[sha256sum] = "2615d065cfaa8c45cc41d55c72207a8d2c60c46386b3d3ee509aee69d6d1ec75"

GEM_NAME = "google-apis-cloudkms_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
