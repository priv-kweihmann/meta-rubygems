# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-codedeploy"
DESCRIPTION = "Official AWS Ruby gem for AWS CodeDeploy (CodeDeploy)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS:class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv4-native \
"

SRC_URI[md5sum] = "94645cea42309babffb88dc927d51227"
SRC_URI[sha256sum] = "5b2594e6579f80307bcff9fb88c20faa2ac367294a5943d3add5e5759bc0b9e8"

GEM_NAME = "aws-sdk-codedeploy"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
