# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-elasticloadbalancingv2"
DESCRIPTION = "Official AWS Ruby gem for Elastic Load Balancing (Elastic Load Balancing v2)"
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

SRC_URI[md5sum] = "d8466a9ecd5436cafbdd724c5421dd6a"
SRC_URI[sha256sum] = "590dbc11c59dd91d7f30dbf42fbbd37ff679d26e01f224011a494633b7f075a1"

GEM_NAME = "aws-sdk-elasticloadbalancingv2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
