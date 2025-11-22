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

SRC_URI[md5sum] = "bb9c90b5ace445a5666fd767b9fcd95a"
SRC_URI[sha256sum] = "3a5387e4ac9f90a448dd6ff038920cd6f4339ddadc849fe82318f1aadd24b62c"

GEM_NAME = "aws-sdk-accessanalyzer"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
