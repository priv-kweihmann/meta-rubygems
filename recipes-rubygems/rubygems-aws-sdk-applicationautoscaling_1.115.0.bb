# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-applicationautoscaling"
DESCRIPTION = "Official AWS Ruby gem for Application Auto Scaling"
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

SRC_URI[md5sum] = "f7cc1e4810a99ad8e2ff555015a6ccba"
SRC_URI[sha256sum] = "3d7514f21388a5f01a7c7941f44d2f7c55ac599ca3da6221246f56ff00457eb4"

GEM_NAME = "aws-sdk-applicationautoscaling"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
