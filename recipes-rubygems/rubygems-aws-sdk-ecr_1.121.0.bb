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

SRC_URI[md5sum] = "922ccf05b6df8fb16b95c39a02d95eaf"
SRC_URI[sha256sum] = "4cdfb475cb4436745f9d210a69be3fedc0dc2e9c60dfbf42ce99e5d41c38639a"

GEM_NAME = "aws-sdk-ecr"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
