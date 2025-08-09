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

SRC_URI[md5sum] = "f0ba52de505a2f4874f99feccc874a34"
SRC_URI[sha256sum] = "3fce35b7cf925bcb4177d934cf8fd1800673677b08d83b8557ce0bfe536c88cf"

GEM_NAME = "aws-sdk-ecrpublic"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
