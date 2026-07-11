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

SRC_URI[md5sum] = "4812540e6733f6181e0d0032a08b5a13"
SRC_URI[sha256sum] = "01cb35ecee5d1c4d1cd4deaed8bb5bddc838e296bcc2a35c5d1ddd07ce40d28d"

GEM_NAME = "google-cloud-env"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-base64 \
    rubygems-faraday \
"

BBCLASSEXTEND = "native"
