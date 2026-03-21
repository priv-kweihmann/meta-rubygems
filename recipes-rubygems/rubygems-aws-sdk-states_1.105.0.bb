# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-states"
DESCRIPTION = "Official AWS Ruby gem for AWS Step Functions (AWS SFN)"
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

SRC_URI[md5sum] = "d0d0e6bdb96746521f0cf39e1cc3d6bd"
SRC_URI[sha256sum] = "caf5d2a0e4cb425f64d6aad1f1cb0ef20b2070b96de2893b9d0f9b2209987274"

GEM_NAME = "aws-sdk-states"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
