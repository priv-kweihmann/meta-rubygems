# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cloudwatchlogs"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch Logs"
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

SRC_URI[md5sum] = "d87cc86284a872e53de0850969fc2132"
SRC_URI[sha256sum] = "85a33c2686a0dd74442c4b483cbc792852277b46166758e89bf31e40e1a6cf01"

GEM_NAME = "aws-sdk-cloudwatchlogs"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
