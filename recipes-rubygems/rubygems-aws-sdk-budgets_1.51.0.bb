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

SRC_URI[md5sum] = "bb87410e24b73a4309cd6e047c747f4b"
SRC_URI[sha256sum] = "229815547f0a675e3612a9beb728f0bf813270aeb8857bf928491847fc964b13"

GEM_NAME = "aws-sdk-budgets"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
