# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-core"
DESCRIPTION = "Provides API clients for AWS"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-aws-eventstream-native \
    rubygems-aws-partitions-native \
    rubygems-aws-sigv4-native \
    rubygems-jmespath-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "da5a17133b9b7d3aa4d86895488e7c45"
SRC_URI[sha256sum] = "56c1ec8bdeb6861d812c840bff5987818083f28b5f2ad184241fe68a90e1b31a"

GEM_NAME = "aws-sdk-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-eventstream \
    rubygems-aws-partitions \
    rubygems-aws-sigv4 \
    rubygems-jmespath \
"

BBCLASSEXTEND = "native"
