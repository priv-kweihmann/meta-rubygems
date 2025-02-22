# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-wafv2"
DESCRIPTION = "Official AWS Ruby gem for AWS WAFV2 (WAFV2)"
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

SRC_URI[md5sum] = "976c43ef59fcd55678c86759414bffc8"
SRC_URI[sha256sum] = "8e7165b4d9cf2c67c57cd37775b28f9fe8fdcce7e4ef570c156375d5f772c0c5"

GEM_NAME = "aws-sdk-wafv2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
