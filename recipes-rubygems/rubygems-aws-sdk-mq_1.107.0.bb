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

SRC_URI[md5sum] = "621f36d6f6d5b75ff9afa6ef7be5bc32"
SRC_URI[sha256sum] = "aa43a2451bfc686849fff15850abb31e68c956336a0ac72f6fcf39dc9b7f62c4"

GEM_NAME = "aws-sdk-mq"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
