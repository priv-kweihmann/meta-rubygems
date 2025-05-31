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

SRC_URI[md5sum] = "6bac1de043600098ce5bdbfc8517a9dc"
SRC_URI[sha256sum] = "b00b4df77a77c3252e8e54974dfdd9d5bf8960c4c5dffbb612acdd084a8948d9"

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
