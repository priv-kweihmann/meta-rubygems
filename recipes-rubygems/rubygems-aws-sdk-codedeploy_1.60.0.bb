# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-codedeploy"
DESCRIPTION = "Official AWS Ruby gem for AWS CodeDeploy (CodeDeploy)"
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

SRC_URI[md5sum] = "ed47406c6f8af214c8d5f5123b2f6577"
SRC_URI[sha256sum] = "c292ac3b4ad0e61f820231ad36866ecec7d46576aefd56743c3bd43d3e355cb0"

GEM_NAME = "aws-sdk-codedeploy"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
