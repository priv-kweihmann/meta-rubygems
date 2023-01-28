# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-elasticbeanstalk"
DESCRIPTION = "Official AWS Ruby gem for AWS Elastic Beanstalk (Elastic Beanstalk)"
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

SRC_URI[md5sum] = "efe5d6d8b06089d268b5594712f694ae"
SRC_URI[sha256sum] = "55ff39ab209a4ad04afd595c9b014a7393d0d3ca826a306127670aac55a40a8e"

GEM_NAME = "aws-sdk-elasticbeanstalk"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
