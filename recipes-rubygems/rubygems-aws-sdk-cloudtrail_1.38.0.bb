# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cloudtrail"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudTrail (CloudTrail)"
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

SRC_URI[md5sum] = "7a6e184b25ca5f97aeddfa98f66b1f44"
SRC_URI[sha256sum] = "a5b9d52442a5c7ce11115929d4bfa8d2713097c9a3f94bd2bb5e31647c0e6fe3"

GEM_NAME = "aws-sdk-cloudtrail"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
