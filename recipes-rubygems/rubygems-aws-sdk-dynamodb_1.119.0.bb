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

SRC_URI[md5sum] = "86f6ceaf09df2d8e479348570887bada"
SRC_URI[sha256sum] = "d67fbe55aaaa435691073aaf3974120b632b34081775451f31004e0c2eccf0bf"

GEM_NAME = "aws-sdk-dynamodb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
