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

SRC_URI[md5sum] = "bad86fa5083cf740a7c100ca39065a84"
SRC_URI[sha256sum] = "5ec28477c26d9f96922fa3700e3a7b420cd8e9e0ff664cfa14e5bfbb886b7adc"

GEM_NAME = "google-apis-iam_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
