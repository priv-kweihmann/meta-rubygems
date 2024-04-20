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

SRC_URI[md5sum] = "3b310987b125c737df2b3591dc480cf9"
SRC_URI[sha256sum] = "8dca3406eee8ece60b4051367303991f510230b1dd0ac9dac4b7feb2af9ec558"

GEM_NAME = "aws-sdk-rds"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
