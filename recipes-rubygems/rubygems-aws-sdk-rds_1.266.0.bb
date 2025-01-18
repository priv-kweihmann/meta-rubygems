# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-rds"
DESCRIPTION = "Official AWS Ruby gem for Amazon Relational Database Service (Amazon RDS)"
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

SRC_URI[md5sum] = "e37f67ffd3a3863d62c68d2c85dba59a"
SRC_URI[sha256sum] = "28a50ddc53dd6619d9651e2cf29035f6a7200fdd92da48cd1a6b585dc9834d19"

GEM_NAME = "aws-sdk-rds"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
