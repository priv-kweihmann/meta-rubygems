# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-sns"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Notification Service (Amazon SNS)"
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

SRC_URI[md5sum] = "c78d61a72980a7d50dd6430be8f7a11a"
SRC_URI[sha256sum] = "48df3f749b0e0ec6f8f49f734ce9977327cbefc0d5f498856793fa5c2453da72"

GEM_NAME = "aws-sdk-sns"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
