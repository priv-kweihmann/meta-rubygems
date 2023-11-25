# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-kinesis"
DESCRIPTION = "Official AWS Ruby gem for Amazon Kinesis (Kinesis)"
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

SRC_URI[md5sum] = "9dfb4b9ce0c771704923c7723a4f9968"
SRC_URI[sha256sum] = "136509a6980e0ce2be719f1fcd1f7a5f0b5a860e859f3b0da73c0cab216fde38"

GEM_NAME = "aws-sdk-kinesis"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
