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

SRC_URI[md5sum] = "4a5204cbf3f185969c03a5b6cc6badc6"
SRC_URI[sha256sum] = "23f81bc0838ae6ec2e8de3eae88af521d0e29d3a59b6c9dbb4b21343ba476bc8"

GEM_NAME = "aws-sdk-kms"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
