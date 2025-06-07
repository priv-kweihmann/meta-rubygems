# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cloudfront"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudFront (CloudFront)"
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

SRC_URI[md5sum] = "8df6252260bdf9d0296ff7bb7537eb37"
SRC_URI[sha256sum] = "11f7105e9e1f950825de12885c605cd014cf470fcf1cbe01587e2b0a6ff4e35a"

GEM_NAME = "aws-sdk-cloudfront"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
