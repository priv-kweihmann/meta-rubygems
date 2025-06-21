# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-apigatewayv2"
DESCRIPTION = "Official AWS Ruby gem for AmazonApiGatewayV2"
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

SRC_URI[md5sum] = "f5040d423ffd2797f8627568ac576c78"
SRC_URI[sha256sum] = "f91427a6c1cc8a7cb0e8d3afb5775466e5eb489595e19f2cc5a4a490fddc1e8d"

GEM_NAME = "aws-sdk-apigatewayv2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
