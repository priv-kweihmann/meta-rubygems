# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-ecr"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Container Registry (Amazon ECR)"
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

SRC_URI[md5sum] = "fb89f51f3ee2f063416c1473637f11af"
SRC_URI[sha256sum] = "2c3d3ae07aec1e8a69f7f95fb880b0250a30ba350741194eb9fb82e289df7642"

GEM_NAME = "aws-sdk-ecr"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
