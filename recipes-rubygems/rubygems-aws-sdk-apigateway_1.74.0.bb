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

SRC_URI[md5sum] = "5f06ce59dd9a5b998cf29d09e1c68fac"
SRC_URI[sha256sum] = "b53b2a91252c067d971d9edaf888005eea396daa37d3113a7d970bef343d0529"

GEM_NAME = "aws-sdk-apigateway"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
