# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-mq"
DESCRIPTION = "Official AWS Ruby gem for AmazonMQ"
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

SRC_URI[md5sum] = "bccbf582e023fd0fdd6625ec4cf68774"
SRC_URI[sha256sum] = "43feb5971046afd0765365dc731ac1fb88a4c11a07b7f7ddf46c0e9b0518ba9d"

GEM_NAME = "aws-sdk-mq"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
