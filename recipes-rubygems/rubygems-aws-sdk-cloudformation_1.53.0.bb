# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cloudformation"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudFormation"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS_class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv4-native \
"

SRC_URI[md5sum] = "0eaa43628b3a45039d576d2816c6992a"
SRC_URI[sha256sum] = "c333f09d492d7fced12e71ce11a4b2d1866ae6da64f036a4d0910492f918fd96"

GEM_NAME = "aws-sdk-cloudformation"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
