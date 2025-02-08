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

SRC_URI[md5sum] = "03ea4fa8bf085953f93bf4f8e0b3a9de"
SRC_URI[sha256sum] = "39c7e3b0650a599e63733e7d38454842615af461317374a9a068bf578ac31be8"

GEM_NAME = "aws-sdk-guardduty"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
