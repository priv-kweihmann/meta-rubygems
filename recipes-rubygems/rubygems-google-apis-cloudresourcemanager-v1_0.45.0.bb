# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-cloudresourcemanager_v1"
DESCRIPTION = "This is the simple REST client for Cloud Resource Manager API V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7d6491039334878d07ed53600fbb6b9f"
SRC_URI[sha256sum] = "ea936d4d51dd0556fb93f4a78131c0441c308906bf076d543c8852dbeec27d45"

GEM_NAME = "google-apis-cloudresourcemanager_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
