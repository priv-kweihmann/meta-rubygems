# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-core"
DESCRIPTION = "Provides API clients for AWS"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS_class-native += "rubygems-aws-eventstream-native \
                         rubygems-aws-partitions-native \
                         rubygems-aws-sigv4-native \
                         rubygems-jmespath-native"
RDEPENDS_${PN}_class-target += "rubygems-aws-eventstream \
                                rubygems-aws-partitions \
                                rubygems-aws-sigv4 \
                                rubygems-jmespath"

SRC_URI[md5sum] = "96b0289b4c274294a68b10cc92cf5a49"
SRC_URI[sha256sum] = "776af037e18d590e2ee8aaf42b4a96f675942579572458204c37a46cfcb29e96"

GEM_NAME = "aws-sdk-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
