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

SRC_URI[md5sum] = "9753d9eaf3d7cc66085ec855a1eb48a5"
SRC_URI[sha256sum] = "7724d3f70b4a539c5e75b5369ac67b2f7fba6bfbb86e4adf47c4806e398498de"

GEM_NAME = "google-apis-cloudresourcemanager_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
