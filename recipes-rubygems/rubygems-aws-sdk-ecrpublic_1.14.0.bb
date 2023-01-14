# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-ecrpublic"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Container Registry Public (Amazon ECR Public)"
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

SRC_URI[md5sum] = "18e82500951315198b1e3c342897e5e2"
SRC_URI[sha256sum] = "c93bda996e475dde65673821f4b787bd3656d285c2d563e0a8db9a58afc14e21"

GEM_NAME = "aws-sdk-ecrpublic"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
