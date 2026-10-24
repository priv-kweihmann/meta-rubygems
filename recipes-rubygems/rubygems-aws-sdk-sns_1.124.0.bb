# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-sns"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Notification Service (Amazon SNS)"
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

SRC_URI[md5sum] = "0a9d64c1420a7c255c651f1cd867432e"
SRC_URI[sha256sum] = "55fc1dc033f9d2d4aa05455a4f50be5003156348e7b8966b82b3845db0bfc203"

GEM_NAME = "aws-sdk-sns"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
