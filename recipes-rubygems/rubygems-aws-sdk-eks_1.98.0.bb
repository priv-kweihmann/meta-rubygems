# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-eks"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Kubernetes Service (Amazon EKS)"
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

SRC_URI[md5sum] = "26aaa65511079ad0b1b3ff7d344cba9a"
SRC_URI[sha256sum] = "552e684f50f2021fa927dcdab1e2015bca977aa14149b1f5661f509673dcc039"

GEM_NAME = "aws-sdk-eks"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
