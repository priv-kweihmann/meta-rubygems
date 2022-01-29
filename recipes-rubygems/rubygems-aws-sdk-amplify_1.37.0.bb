# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-amplify"
DESCRIPTION = "Official AWS Ruby gem for AWS Amplify (Amplify)"
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

SRC_URI[md5sum] = "f8d917c6b7c75ed5a0340a489321b83d"
SRC_URI[sha256sum] = "a7fc9cc1ef9aabbaca841eb61a9ea652d5730e19336aa45e42772ed8711f05b2"

GEM_NAME = "aws-sdk-amplify"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
