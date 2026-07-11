# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-applicationautoscaling"
DESCRIPTION = "Official AWS Ruby gem for Application Auto Scaling"
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

SRC_URI[md5sum] = "4dd85048f1de112e8fe63c515edceebb"
SRC_URI[sha256sum] = "3925bf0a65c64cd0971194abca3195832b04065252ee5a35f664eea8fa80e799"

GEM_NAME = "aws-sdk-applicationautoscaling"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
