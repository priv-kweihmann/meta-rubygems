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

SRC_URI[md5sum] = "376dc02ee70c8ff6090fcdc0afc2d374"
SRC_URI[sha256sum] = "0114aa8a0dd4b6ffe4157d33cfe034359875ef48c188a76107481cd9ab20408d"

GEM_NAME = "aws-sdk-kinesis"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
