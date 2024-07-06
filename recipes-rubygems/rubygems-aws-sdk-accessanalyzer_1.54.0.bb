# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-accessanalyzer"
DESCRIPTION = "Official AWS Ruby gem for Access Analyzer"
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

SRC_URI[md5sum] = "6d2efa204688415b8cb4b73a899406dd"
SRC_URI[sha256sum] = "e5d8b0a42f552a36dda083df31717c46e0881f78eed3708edb234f3181adcb54"

GEM_NAME = "aws-sdk-accessanalyzer"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
