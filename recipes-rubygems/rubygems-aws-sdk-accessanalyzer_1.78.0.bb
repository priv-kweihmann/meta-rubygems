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

SRC_URI[md5sum] = "76a1d0033bbbc2bb77e680a4ce1e5331"
SRC_URI[sha256sum] = "ea746f01147ccd42dd42ab33ed31e4fec749d7d41e7921cac72e21901f19feed"

GEM_NAME = "aws-sdk-accessanalyzer"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
