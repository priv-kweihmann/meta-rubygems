# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-budgets"
DESCRIPTION = "Official AWS Ruby gem for AWS Budgets (AWSBudgets)"
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

SRC_URI[md5sum] = "b35b22547e336b421e5130283f0b3b7e"
SRC_URI[sha256sum] = "2881ab69e593e1038f42a8aa5807cfb4e46c4714f446b8d5af3a918626d30919"

GEM_NAME = "aws-sdk-budgets"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
