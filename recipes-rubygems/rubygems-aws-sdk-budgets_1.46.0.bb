# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-budgets"
DESCRIPTION = "Official AWS Ruby gem for AWS Budgets (AWSBudgets)"
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

SRC_URI[md5sum] = "1c5d09e76c6619e62ad31161b12e432d"
SRC_URI[sha256sum] = "eb94e33d2ff9e146c4c9c3d111ab5b7a518671542ae079c07a2be8cac1559c23"

GEM_NAME = "aws-sdk-budgets"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
