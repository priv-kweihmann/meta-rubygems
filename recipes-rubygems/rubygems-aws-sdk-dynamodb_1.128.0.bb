# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-dynamodb"
DESCRIPTION = "Official AWS Ruby gem for Amazon DynamoDB (DynamoDB)"
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

SRC_URI[md5sum] = "1ab633b6b601ba39f0548bf47796972e"
SRC_URI[sha256sum] = "9376590ca05b844fff88622458f11d9af0527fdee248163e5d985e6cb89b4e02"

GEM_NAME = "aws-sdk-dynamodb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
