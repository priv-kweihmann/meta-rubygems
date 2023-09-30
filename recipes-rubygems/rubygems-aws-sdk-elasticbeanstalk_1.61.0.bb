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

SRC_URI[md5sum] = "b0955815e7c111250edff7b2dc74dad4"
SRC_URI[sha256sum] = "d61cd785665dc1b6a09ed52e2cd0f43dd0d583d567d9246409dc45a28a48045a"

GEM_NAME = "aws-sdk-elasticbeanstalk"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
