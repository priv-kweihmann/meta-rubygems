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

SRC_URI[md5sum] = "1eb2b21d1e8471ecd4ffbb037c7464fd"
SRC_URI[sha256sum] = "a83c569ecec5e7607dccffd3d32f9cb5ae620ee9dad549e632e236d8c4155aa0"

GEM_NAME = "aws-sdk-autoscaling"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
