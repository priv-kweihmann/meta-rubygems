# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-core"
DESCRIPTION = "Provides API clients for AWS"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-aws-eventstream-native \
    rubygems-aws-partitions-native \
    rubygems-aws-sigv4-native \
    rubygems-jmespath-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1a9a0d27a87c37d94b73b7d60be6d9e5"
SRC_URI[sha256sum] = "384e376dd8753b313f08deb7346f549d0e580be21e86dec42f43a0dd9af8b932"

GEM_NAME = "aws-sdk-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-eventstream \
    rubygems-aws-partitions \
    rubygems-aws-sigv4 \
    rubygems-jmespath \
"

BBCLASSEXTEND = "native"
