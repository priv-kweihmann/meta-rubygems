# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-databasemigrationservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Database Migration Service"
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

SRC_URI[md5sum] = "9ebf023a1d58257c9dbe3a6d67e4a774"
SRC_URI[sha256sum] = "9c1278adec9a8abe54e60386cd490bfac5c555fcc046d6a161fc2b3ad10bd8c1"

GEM_NAME = "aws-sdk-databasemigrationservice"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
