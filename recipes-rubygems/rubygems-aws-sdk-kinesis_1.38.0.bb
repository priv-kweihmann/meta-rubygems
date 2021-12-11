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

SRC_URI[md5sum] = "bfc685fc708c494a5b6f8df38f0f3ea5"
SRC_URI[sha256sum] = "b48d2b1281a14157040af97d79d3338d548ad13b9b9a47c6a11a9829eaadf2f5"

GEM_NAME = "aws-sdk-kinesis"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
