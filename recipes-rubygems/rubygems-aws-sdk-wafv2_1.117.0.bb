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

SRC_URI[md5sum] = "3684c89b57eb902da2e2a8b6b1422fd4"
SRC_URI[sha256sum] = "c8bb3c9a9186fd15ef85c86f5e157d98eee46dfdd538031641ac7b14aff32807"

GEM_NAME = "aws-sdk-wafv2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
