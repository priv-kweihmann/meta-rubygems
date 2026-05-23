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

SRC_URI[md5sum] = "ec321cee2a1b01f21008731be4089612"
SRC_URI[sha256sum] = "b37a92e38a319644d6a337decfdd5a0c68ba3c6799e5834ee2221d05d5f53fa4"

GEM_NAME = "aws-sdk-mq"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
