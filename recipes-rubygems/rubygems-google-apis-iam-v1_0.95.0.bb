# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-iam_v1"
DESCRIPTION = "This is the simple REST client for Identity and Access Management (IAM) API V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f57790d7c3d822fce40ac2174476e4e8"
SRC_URI[sha256sum] = "c74532e59a716bf69171a5c30c627dc2d47498a285659aa750662223bee52764"

GEM_NAME = "google-apis-iam_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
