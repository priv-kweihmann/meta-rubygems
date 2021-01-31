# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-core"
DESCRIPTION = "Provides API clients for AWS"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS_class-native += "rubygems-aws-eventstream-native \
                  rubygems-aws-partitions-native \
                  rubygems-aws-sigv4-native \
                  rubygems-jmespath-native"
RDEPENDS_${PN}_class-target += "rubygems-aws-eventstream \
                  rubygems-aws-partitions \
                  rubygems-aws-sigv4 \
                  rubygems-jmespath"

SRC_URI[md5sum] = "29f45906de1a73ef703e30aa7e2cc22b"
SRC_URI[sha256sum] = "24be3799c92416dc9df913d34df162298d4279937412c264ca92827b2d0bd22d"

GEM_NAME = "aws-sdk-core"

inherit rubygems
inherit rubygentest

BBCLASSEXTEND = "native"
