# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-route53domains"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 Domains"
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

SRC_URI[md5sum] = "6acfc00484a0a23b69feb7579d5d9598"
SRC_URI[sha256sum] = "eac220b0b5428c5c0dd36a5dfa4843d09567f734990c7955f271e388bf3e063b"

GEM_NAME = "aws-sdk-route53domains"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
