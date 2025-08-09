# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-firehose"
DESCRIPTION = "Official AWS Ruby gem for Amazon Kinesis Firehose (Firehose)"
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

SRC_URI[md5sum] = "9ad6438c35dc9496d7a4e7f191af1e70"
SRC_URI[sha256sum] = "36a39e0a353fa5b66352ca54745a0980803f24ff704376724ae193205dea8ac8"

GEM_NAME = "aws-sdk-firehose"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
