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

SRC_URI[md5sum] = "ce3cee87cc2612515cbb5d801e4474f3"
SRC_URI[sha256sum] = "d2a80c4716306ada75bfbe2763e9ecef1bbfc85f48a482cd756870b1372ee684"

GEM_NAME = "aws-sdk-applicationautoscaling"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
