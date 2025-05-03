# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-wafv2"
DESCRIPTION = "Official AWS Ruby gem for AWS WAFV2 (WAFV2)"
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

SRC_URI[md5sum] = "5781e78e06fce867d4063f6a7dac473e"
SRC_URI[sha256sum] = "5d9c38b66f77abe0d575256a3c118fd8a0f6c37668bd08bfe648d516bae2a30d"

GEM_NAME = "aws-sdk-wafv2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
