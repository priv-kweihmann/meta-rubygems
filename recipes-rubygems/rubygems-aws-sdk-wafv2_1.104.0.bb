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

SRC_URI[md5sum] = "b035000135e290b21292c1765be3b5b0"
SRC_URI[sha256sum] = "4556d8a121a078a6f5677028df1de964967d41fd287c77307e8f7c331848a3ab"

GEM_NAME = "aws-sdk-wafv2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
