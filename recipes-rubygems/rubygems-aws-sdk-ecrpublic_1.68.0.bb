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

SRC_URI[md5sum] = "969b8bc423d1489fc38d4bfe8e8ddc4e"
SRC_URI[sha256sum] = "22f7c8b93488b35e463a9becb2b10f6d8a84fc1554804ce08178b8b62c63194b"

GEM_NAME = "aws-sdk-ecrpublic"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
