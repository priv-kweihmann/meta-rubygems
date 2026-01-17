# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-elasticache"
DESCRIPTION = "Official AWS Ruby gem for Amazon ElastiCache"
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

SRC_URI[md5sum] = "cc18e6b1743786786cc4edbb42f94083"
SRC_URI[sha256sum] = "ea556e31ff9b647171c10d33430b7c880306a2116af27b2e531ce78a3323fdb4"

GEM_NAME = "aws-sdk-elasticache"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
