# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-networkmanager"
DESCRIPTION = "Official AWS Ruby gem for AWS Network Manager (NetworkManager)"
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

SRC_URI[md5sum] = "d167d7e97dd69da08c63044eeed6ab50"
SRC_URI[sha256sum] = "fd7111576979833ef8b99f0d39aedebaef8b2237b3e7e1214d9011426e1ec1f3"

GEM_NAME = "aws-sdk-networkmanager"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
