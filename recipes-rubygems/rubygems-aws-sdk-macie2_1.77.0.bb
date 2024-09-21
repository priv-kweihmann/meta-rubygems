# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-macie2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Macie 2"
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

SRC_URI[md5sum] = "cf4637b9c98d2fab5562ff94639534d3"
SRC_URI[sha256sum] = "d6cdf5c75a4f6d4682f8515683fd31f7332c0fd1444535e6995146b9c376f44b"

GEM_NAME = "aws-sdk-macie2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
