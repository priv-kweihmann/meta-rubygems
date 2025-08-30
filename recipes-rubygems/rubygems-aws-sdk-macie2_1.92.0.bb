# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-macie2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Macie 2"
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

SRC_URI[md5sum] = "27d85f3e7091cc60fa7a4ea0b2f64a67"
SRC_URI[sha256sum] = "bb2cb11f15e6c47e6d03aec2734b7a29f504a757f1b776cbf31abf0f13de6c15"

GEM_NAME = "aws-sdk-macie2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
