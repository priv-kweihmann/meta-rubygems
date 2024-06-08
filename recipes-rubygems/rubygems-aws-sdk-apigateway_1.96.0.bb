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

SRC_URI[md5sum] = "885e4ce098edd55ee221c3b44fd84f5d"
SRC_URI[sha256sum] = "9b96b8e59ff6ee15d079c3cc5ea8750d6e6e9a3972df68cd8c669811c9ef3205"

GEM_NAME = "aws-sdk-apigateway"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
