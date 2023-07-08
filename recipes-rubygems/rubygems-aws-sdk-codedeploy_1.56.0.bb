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

SRC_URI[md5sum] = "0125fe87399264c67442a7e5b35d2bbb"
SRC_URI[sha256sum] = "dadc4d1ec1096676207b24ce60ce136d702d3eaa4eb86df8c74caa8461470d7b"

GEM_NAME = "aws-sdk-codedeploy"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
