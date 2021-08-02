# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sigv4"
DESCRIPTION = "Amazon Web Services Signature Version 4 signing library"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS:class-native += "\
    rubygems-aws-eventstream-native \
"

SRC_URI[md5sum] = "dc1674c1675fea2b561433e3632c3be5"
SRC_URI[sha256sum] = "c0e5b98aafc39f8b7ef258495de1c58698a79149c8c5aecdf464a70e9e866931"

GEM_NAME = "aws-sigv4"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-eventstream \
"

BBCLASSEXTEND = "native"
