# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cloudwatch"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch (CloudWatch)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS_class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv4-native \
"

SRC_URI[md5sum] = "6a8e83d0eccbf71a06e3c7b0a6a8f7dc"
SRC_URI[sha256sum] = "c8937d420ccd5d8c233d098bc18c8df3775a984c3de1313e6feaacd244b34d87"

GEM_NAME = "aws-sdk-cloudwatch"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
