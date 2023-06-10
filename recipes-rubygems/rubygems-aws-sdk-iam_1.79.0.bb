# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-iam"
DESCRIPTION = "Official AWS Ruby gem for AWS Identity and Access Management (IAM)"
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

SRC_URI[md5sum] = "d6e43615e7fa72df5657f9a2d228ee50"
SRC_URI[sha256sum] = "3489a0958a24638eba8ae5b9bcc810b669b96299fba5eab2e05f19fa321964d4"

GEM_NAME = "aws-sdk-iam"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
