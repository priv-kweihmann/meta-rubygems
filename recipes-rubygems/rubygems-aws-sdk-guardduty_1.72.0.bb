# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-guardduty"
DESCRIPTION = "Official AWS Ruby gem for Amazon GuardDuty"
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

SRC_URI[md5sum] = "596d40ce597b72a809174bb123c91f78"
SRC_URI[sha256sum] = "182a9bc6cded53964fc2804299251ffeb69f7442a932e4f15695545a5f365f0b"

GEM_NAME = "aws-sdk-guardduty"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
