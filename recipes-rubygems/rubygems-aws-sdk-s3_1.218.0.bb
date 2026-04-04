# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-s3"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Storage Service (Amazon S3)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sdk-kms-native \
    rubygems-aws-sigv4-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "6aa5b4a94146e334fc77bfa4179d3329"
SRC_URI[sha256sum] = "5672a5f32107f2adfa8ca1ff33188fb534a6fd7560c52e8817458698c7c9988c"

GEM_NAME = "aws-sdk-s3"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sdk-kms \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
