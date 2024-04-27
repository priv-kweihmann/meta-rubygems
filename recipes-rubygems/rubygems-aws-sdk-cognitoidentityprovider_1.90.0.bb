# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cognitoidentityprovider"
DESCRIPTION = "Official AWS Ruby gem for Amazon Cognito Identity Provider"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv4-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0594f8ccb5c9d5903bc1e966e3f8abda"
SRC_URI[sha256sum] = "b97ba777c924f32b5a94ddf5bc995978e2000a52f9fa9f313905b80e5f32e95e"

GEM_NAME = "aws-sdk-cognitoidentityprovider"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
