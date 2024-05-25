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

SRC_URI[md5sum] = "352766dcbacb79100042bf7706ff6029"
SRC_URI[sha256sum] = "ed8163233e76f6198bd327e651f505111c5776204c1e4bea12912aa036ca5ab5"

GEM_NAME = "google-apis-cloudkms_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
