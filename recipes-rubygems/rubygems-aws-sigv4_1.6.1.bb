# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sigv4"
DESCRIPTION = "Amazon Web Services Signature Version 4 signing library"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-aws-eventstream-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d8916e5d46f785b1f5a0034a7a61bb73"
SRC_URI[sha256sum] = "1c158f74d7daa882459bd5a686bccc25041af127a6b791911f2233e7673df1f3"

GEM_NAME = "aws-sigv4"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-eventstream \
"

BBCLASSEXTEND = "native"
