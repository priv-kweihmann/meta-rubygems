# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cloudwatchlogs"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch Logs"
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

SRC_URI[md5sum] = "303144bc3d91f2edadbc4828820ff0fd"
SRC_URI[sha256sum] = "870f7140c6decb8966e0793bec001bfd1b76443b55df9d3282381059309b630b"

GEM_NAME = "aws-sdk-cloudwatchlogs"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
