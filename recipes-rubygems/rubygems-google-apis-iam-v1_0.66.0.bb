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

SRC_URI[md5sum] = "aac77d80c421ce0b74f1c648d46ab465"
SRC_URI[sha256sum] = "5e8837627120357c20a5d35f36f76b4b16099a1dba5e47f1b3b810755a908e19"

GEM_NAME = "google-apis-iam_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
