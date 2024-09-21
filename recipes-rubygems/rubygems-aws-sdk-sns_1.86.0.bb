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

SRC_URI[md5sum] = "3d06620d15c9847bb92173f38b3b9fd2"
SRC_URI[sha256sum] = "8caf238a2af32b501dbf7499972abdd438f38706a2b7c2b05a0e75a02e052be2"

GEM_NAME = "aws-sdk-sns"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
