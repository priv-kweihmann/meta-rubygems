# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-admin_directory_v1"
DESCRIPTION = "This is the simple REST client for Admin SDK API DirectoryV1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ca7c003f53c7beb9bd5e0820014f0df1"
SRC_URI[sha256sum] = "22d05a550825e146a3c324466d1532117d144a1eca3b99be317521f018442b13"

GEM_NAME = "google-apis-admin_directory_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
