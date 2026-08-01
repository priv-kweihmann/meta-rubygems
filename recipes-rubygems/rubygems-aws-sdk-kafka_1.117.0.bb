# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-kafka"
DESCRIPTION = "Official AWS Ruby gem for Managed Streaming for Kafka (Kafka)"
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

SRC_URI[md5sum] = "2bd6fd8f15fc96b9cf6448f55987d9dc"
SRC_URI[sha256sum] = "e135c8d667f01210fcdae16475786e72df10e79588c219b9ceec2e1dbcb68605"

GEM_NAME = "aws-sdk-kafka"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
