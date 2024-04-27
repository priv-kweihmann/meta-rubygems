# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-kms"
DESCRIPTION = "Official AWS Ruby gem for AWS Key Management Service (KMS)"
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

SRC_URI[md5sum] = "470e18e52a9c6a89c4dc21ea6a074cd9"
SRC_URI[sha256sum] = "55621357f04d43cf03fd4ca1d7113a52799f5ea482f2417557140d702736eae5"

GEM_NAME = "aws-sdk-kms"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
