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

SRC_URI[md5sum] = "4007985f1491b2a2709695f0fe589b82"
SRC_URI[sha256sum] = "83fb98923a4d78ff09bfbd31b8526b0c36a8dd64f6bc21b473fed4d15cd53ad5"

GEM_NAME = "aws-sdk-rds"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
