# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-ssm"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Systems Manager (SSM) (Amazon SSM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS_class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv4-native \
"

SRC_URI[md5sum] = "a0b3dea3a4980d5b9ab94a047245aaa6"
SRC_URI[sha256sum] = "c04a9598e5e4d7a778d2d2e48f6c7edb9ec4dbdcb936ce73304e09d69ad23798"

GEM_NAME = "aws-sdk-ssm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
