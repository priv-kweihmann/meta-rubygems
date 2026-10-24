# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cloudwatchevents"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch Events"
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

SRC_URI[md5sum] = "2f6a78428fd67cc353023a611dcdc549"
SRC_URI[sha256sum] = "06c3ec6a741bba23c13756a26c4dce599ec532390ea1f9d19451640bd1a5fd2e"

GEM_NAME = "aws-sdk-cloudwatchevents"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
