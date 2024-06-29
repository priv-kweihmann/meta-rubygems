# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-simpledb"
DESCRIPTION = "Official AWS Ruby gem for Amazon SimpleDB"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv2-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "23e353679f503bdbff90f10fbd4a0c5f"
SRC_URI[sha256sum] = "7947b8f2e1ed0599f503f59c15c893cb2595091621141b38c0fcb8206b9da4c8"

GEM_NAME = "aws-sdk-simpledb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv2 \
"

BBCLASSEXTEND = "native"
