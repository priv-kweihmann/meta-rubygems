# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-autoscaling"
DESCRIPTION = "Official AWS Ruby gem for Auto Scaling"
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

SRC_URI[md5sum] = "f9b4b7e712e05fd20e468b406057380a"
SRC_URI[sha256sum] = "fef94003f275f1c59b8b4bcac680140722f4a3e8344b07580f28f2f8ef315333"

GEM_NAME = "aws-sdk-autoscaling"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
