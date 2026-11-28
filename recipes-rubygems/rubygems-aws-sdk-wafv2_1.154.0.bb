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

SRC_URI[md5sum] = "7993f529fb7bfc97e86d300f23d44795"
SRC_URI[sha256sum] = "1ed8e6229baf98e9b1348fea4bb1df77e952d3a078b08e68c5516057b0c76c8d"

GEM_NAME = "aws-sdk-wafv2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
