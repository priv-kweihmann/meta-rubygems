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

SRC_URI[md5sum] = "5d96e72544ec15a672df7e9e20540370"
SRC_URI[sha256sum] = "c22095616578404a599b28eef84b5862fd7146d01801544e9fd819accc01ba18"

GEM_NAME = "aws-sdk-elasticloadbalancingv2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
