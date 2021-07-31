# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-ecs"
DESCRIPTION = "Official AWS Ruby gem for Amazon EC2 Container Service (Amazon ECS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS_class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv4-native \
"

SRC_URI[md5sum] = "9b40a3573f480977e2283f4863dad6b0"
SRC_URI[sha256sum] = "9698ca32b327afaf915d39a7097c6a07ef54bbb82fcb62f52e02dabb447e3872"

GEM_NAME = "aws-sdk-ecs"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
