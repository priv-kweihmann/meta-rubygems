# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cognitoidentity"
DESCRIPTION = "Official AWS Ruby gem for Amazon Cognito Identity"
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

SRC_URI[md5sum] = "a559e1de9e53cf487cb803e2d5c5f163"
SRC_URI[sha256sum] = "a0dbadf3acb34038364258b8d04a09c9bb0cf5b395c8201854f10b961d8d6d84"

GEM_NAME = "aws-sdk-cognitoidentity"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
