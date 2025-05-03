# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-apigateway"
DESCRIPTION = "Official AWS Ruby gem for Amazon API Gateway"
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

SRC_URI[md5sum] = "dede60257f49b2ce0217b31be502b470"
SRC_URI[sha256sum] = "71a339a1c24c1d8b94ac0bd7c68bcbbfdafaeae90c27db59471c8f3c15d65783"

GEM_NAME = "aws-sdk-apigateway"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
