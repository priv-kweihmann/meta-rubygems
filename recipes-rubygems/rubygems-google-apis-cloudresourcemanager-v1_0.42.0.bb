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

SRC_URI[md5sum] = "f633aabb4ff405718bb73fb3c560c0bf"
SRC_URI[sha256sum] = "3ec59c15f396661144ac1ddb308235b1dbfe0d01d4729cfecb7c09dbd35e97f2"

GEM_NAME = "google-apis-cloudresourcemanager_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
