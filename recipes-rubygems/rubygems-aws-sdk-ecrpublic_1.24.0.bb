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

SRC_URI[md5sum] = "40f91c50d2ef05d2054461e3f5260f9f"
SRC_URI[sha256sum] = "71317336d24a1e2a39d7d2a0b93d0dbb82572c28dfc871d38653203bf01cc54e"

GEM_NAME = "aws-sdk-ecrpublic"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"