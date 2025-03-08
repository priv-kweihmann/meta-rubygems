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

SRC_URI[md5sum] = "b7a40d6acb5bd689729024dbe1eeafac"
SRC_URI[sha256sum] = "a2d07e0dcd2c750e2b2001d466dfb8f29928457670f644a4ba18aa73deb6003b"

GEM_NAME = "google-apis-admin_directory_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
