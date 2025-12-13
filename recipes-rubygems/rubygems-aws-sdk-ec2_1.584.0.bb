# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-ec2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Compute Cloud (Amazon EC2)"
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

SRC_URI[md5sum] = "7e50c194b3a3fcf88a579f9279101c56"
SRC_URI[sha256sum] = "cf4873be8035d70b6757269f9746249a64a4e845795485f709827fe7284136b6"

GEM_NAME = "aws-sdk-ec2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
