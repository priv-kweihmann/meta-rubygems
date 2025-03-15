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

SRC_URI[md5sum] = "2953d34ecc9d28d8ea06988886e1c515"
SRC_URI[sha256sum] = "94bed40e05a67e9468ce1cb38389fba9a90aa8fc62fc9e173204c1dca59e21e7"

GEM_NAME = "google-cloud-env"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
