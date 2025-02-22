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

SRC_URI[md5sum] = "0076178239db9af70adcb321d8f4a269"
SRC_URI[sha256sum] = "b546c2d455f579b91a5943164236dc148b3012c468cd0d53aa1c2c1fe82dfd08"

GEM_NAME = "aws-sdk-cognitoidentity"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
