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

SRC_URI[md5sum] = "0cbc4338991925527c85d547149c536e"
SRC_URI[sha256sum] = "7c7646a0d54695caf347527cdd0c1be29b4d309d200998d6f005d444712112a3"

GEM_NAME = "aws-sdk-budgets"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
