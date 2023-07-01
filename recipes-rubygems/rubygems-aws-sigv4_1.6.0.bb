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

SRC_URI[md5sum] = "a5a45f14886bbdcff038262a80dc4c75"
SRC_URI[sha256sum] = "ca9e6a15cd424f1f32b524b9760995331459bc22e67d3daad4fcf0c0084b087d"

GEM_NAME = "aws-sigv4"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-eventstream \
"

BBCLASSEXTEND = "native"
