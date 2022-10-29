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

SRC_URI[md5sum] = "60ad30d0227530db5f1b70f4eb33782c"
SRC_URI[sha256sum] = "ad0803630155d155e9802e3c9bff2260a04afba2f93f63a1f12c4cdffe740e40"

GEM_NAME = "aws-sdk-sms"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
