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

SRC_URI[md5sum] = "786d9bb4ebd74868a5052cfd4c10d0e6"
SRC_URI[sha256sum] = "6f181165f161dd4d53e98c412d345d262114b2e26ef790d57a754f1fcf436a49"

GEM_NAME = "google-apis-iam_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
