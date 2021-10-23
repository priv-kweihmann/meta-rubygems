# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-organizations"
DESCRIPTION = "Official AWS Ruby gem for AWS Organizations (Organizations)"
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

SRC_URI[md5sum] = "b84a15fa61853885454c66dfd28c35ef"
SRC_URI[sha256sum] = "44ba0e156d6746564474983e03481624df7bce057cba8ff4a368ccdd2bc7f745"

GEM_NAME = "aws-sdk-organizations"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
