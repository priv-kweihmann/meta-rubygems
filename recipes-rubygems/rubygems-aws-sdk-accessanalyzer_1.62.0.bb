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

SRC_URI[md5sum] = "c3df8e0f511dae5e7bfc28f4fa7efd4c"
SRC_URI[sha256sum] = "18a40c73314ac7fa83bc1492247eb1c7d4c003371bfc724c3d11f6e03f977d22"

GEM_NAME = "aws-sdk-accessanalyzer"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
