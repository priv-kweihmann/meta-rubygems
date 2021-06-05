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

SRC_URI[md5sum] = "6769e3bd1749592b9ce817ef13c0b8c9"
SRC_URI[sha256sum] = "e28b117714089791c7d8515fe9d73ec7bf643fda065ae25d1a636179a4b67a26"

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
