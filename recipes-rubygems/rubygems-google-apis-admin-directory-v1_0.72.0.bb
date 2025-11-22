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

SRC_URI[md5sum] = "966b6e567f3db97ee2f37c8fd2b25b10"
SRC_URI[sha256sum] = "4ba6834db6a0f5ed9d4fdbb9bcfb7e8b424a950110830b7602b68f70b5a4dd29"

GEM_NAME = "google-apis-admin_directory_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
