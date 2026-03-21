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

SRC_URI[md5sum] = "aa569a957e6f1fa84ab3f33eddd173bc"
SRC_URI[sha256sum] = "33c3335bb4a819cbfe3392323ac2f859440a3aa130e19574e6ae6db327b4598d"

GEM_NAME = "aws-sdk-macie2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
