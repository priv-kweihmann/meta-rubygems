# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-api-client"
DESCRIPTION = "Client for accessing Google APIs"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f124bfaefacd4e1a4080065d403bc1d4"

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
    rubygems-google-apis-generator-native \
"

SRC_URI[md5sum] = "1b303920fe3bab13fd08331a3f1514fd"
SRC_URI[sha256sum] = "41006ef21fe02a70cff39a10aebf84fa7fb5f24c63566ab12b149ff1f1d9d7ff"

GEM_NAME = "google-api-client"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
    rubygems-google-apis-generator \
"

BBCLASSEXTEND = "native"
