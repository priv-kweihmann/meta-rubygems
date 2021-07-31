# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-apigatewayv2"
DESCRIPTION = "Official AWS Ruby gem for AmazonApiGatewayV2"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS_class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv4-native \
"

SRC_URI[md5sum] = "0ec57f5de7a001e14ecc411112f5b554"
SRC_URI[sha256sum] = "14f9b8dd53fb406e60ba95408ca68ba98f523794cbfb13c95ea446a1ae3c62c9"

GEM_NAME = "aws-sdk-apigatewayv2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
