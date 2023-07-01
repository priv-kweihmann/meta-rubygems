# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-sqs"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Queue Service (Amazon SQS)"
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

SRC_URI[md5sum] = "bc1467d35b98948f3ac4b1e336b50108"
SRC_URI[sha256sum] = "590d50dbf3b9555da907a1e3532abcba43ad1bac33e8a7693ea00a45bfc431e1"

GEM_NAME = "aws-sdk-sqs"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
