# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-account"
DESCRIPTION = "Official AWS Ruby gem for AWS Account"
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

SRC_URI[md5sum] = "869867c4d38bf562a235b452f7f1c93b"
SRC_URI[sha256sum] = "92692c3d62244b3b631bc4440522a807b1380c85e107b832c233d16ef424a0c0"

GEM_NAME = "aws-sdk-account"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
