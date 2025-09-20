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

SRC_URI[md5sum] = "6dcc826c0bd9669897ade22ef28ce72a"
SRC_URI[sha256sum] = "aaef2ea334ec1e0fe4aa1be1b414e9c155d80d37d8c02ba89d1886969f7de29c"

GEM_NAME = "google-apis-iam_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
