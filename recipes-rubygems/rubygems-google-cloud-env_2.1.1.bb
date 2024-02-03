# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-cloud-env"
DESCRIPTION = "google-cloud-env provides information on the Google Cloud Platform hosting environment"
HOMEPAGE = "https://github.com/googleapis/ruby-cloud-env"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-faraday-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0175a2ce93b53f42141e8b24acef763f"
SRC_URI[sha256sum] = "cf4bb8c7d517ee1ea692baedf06e0b56ce68007549d8d5a66481aa9f97f46999"

GEM_NAME = "google-cloud-env"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
