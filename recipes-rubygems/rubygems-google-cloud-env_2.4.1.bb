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

SRC_URI[md5sum] = "c43dc62ed416b0ed82d1b89ae271616b"
SRC_URI[sha256sum] = "987cc58afc50ce2903128ab4dcd442159be4457246b8137e41d49d5c3fc590dd"

GEM_NAME = "google-cloud-env"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
