# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-cloud-env"
DESCRIPTION = "google-cloud-env provides information on the Google Cloud Platform hosting environment"
HOMEPAGE = "https://github.com/googleapis/ruby-cloud-env"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-base64-native \
    rubygems-faraday-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5a5c6bf23c290fb75d6f09179e2db107"
SRC_URI[sha256sum] = "db80b120fc163d1b83ffe8c0bc82e9ad0025ef0d51d987068c7278677ee5caf7"

GEM_NAME = "google-cloud-env"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
