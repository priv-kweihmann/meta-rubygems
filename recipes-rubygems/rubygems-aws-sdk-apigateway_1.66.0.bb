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

SRC_URI[md5sum] = "e2e19a49e7a9db6ca4ea637e0c373e8f"
SRC_URI[sha256sum] = "f5ad4f806f2582d28ca62a9807d1e9e452d98b4ba4518fd65c7369fd90965096"

GEM_NAME = "aws-sdk-apigateway"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
