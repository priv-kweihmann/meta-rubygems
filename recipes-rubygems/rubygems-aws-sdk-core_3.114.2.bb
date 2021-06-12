# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-core"
DESCRIPTION = "Provides API clients for AWS"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS_class-native += "\
    rubygems-aws-eventstream-native \
    rubygems-aws-partitions-native \
    rubygems-aws-sigv4-native \
    rubygems-jmespath-native \
"

SRC_URI[md5sum] = "264ded83b366e7cc146f605621e115b8"
SRC_URI[sha256sum] = "0180c936ecfb714061491e5370bd0f3a4709b22d2c252ffd9380b35edbc6cb27"

GEM_NAME = "aws-sdk-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-aws-eventstream \
    rubygems-aws-partitions \
    rubygems-aws-sigv4 \
    rubygems-jmespath \
"

BBCLASSEXTEND = "native"
