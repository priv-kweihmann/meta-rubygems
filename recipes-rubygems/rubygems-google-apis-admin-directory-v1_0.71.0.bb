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

SRC_URI[md5sum] = "e619e27bc34d2f76cb6fcc3a6d966b53"
SRC_URI[sha256sum] = "59620fe3ff41ea5f65dc031c1178699e4c915ba66b30104db63b3eab1b55b1ab"

GEM_NAME = "google-apis-admin_directory_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
