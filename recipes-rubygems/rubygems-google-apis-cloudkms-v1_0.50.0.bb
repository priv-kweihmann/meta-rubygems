# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-cloudkms_v1"
DESCRIPTION = "This is the simple REST client for Cloud Key Management Service (KMS) API V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7e3101fd51b8b7b241004d2303721999"
SRC_URI[sha256sum] = "0d8253ea7cfe87a2a07f5b170597cad33dae7b8d894280064355eb4d4bf05272"

GEM_NAME = "google-apis-cloudkms_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"