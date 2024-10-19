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

SRC_URI[md5sum] = "3394dbcaf0ec3451e64cc85df9eee9a3"
SRC_URI[sha256sum] = "bc1ee83723c273c8e77deb0eb3123e1d75631c00df998b0abd5803aaa96f8a57"

GEM_NAME = "aws-sdk-ecrpublic"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
