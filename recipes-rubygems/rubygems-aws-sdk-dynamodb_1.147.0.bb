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

SRC_URI[md5sum] = "d5fc6523f0333d5fcce826822614580a"
SRC_URI[sha256sum] = "0ccd41fc2ab2653a8be75645ccaecf7406135cf20672ad87469ff7aa5bd541ff"

GEM_NAME = "aws-sdk-dynamodb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
