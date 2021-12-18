# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-sms"
DESCRIPTION = "Official AWS Ruby gem for AWS Server Migration Service (SMS)"
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

SRC_URI[md5sum] = "48ea0011a8b60e5e5296018c8f363e4b"
SRC_URI[sha256sum] = "7ccfd50f6d329c03f2f4f56deac5c598eec2e41ec1e60963fa1571feccc05fc6"

GEM_NAME = "aws-sdk-sms"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
