# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-alexaforbusiness"
DESCRIPTION = "Official AWS Ruby gem for Alexa For Business"
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

SRC_URI[md5sum] = "f4808196de53f47ca2b2e908a350ae82"
SRC_URI[sha256sum] = "aa684c2ea0d30c08e78ef6a4b5c609a7681f73a656092105d7b315ff9a8fea4b"

GEM_NAME = "aws-sdk-alexaforbusiness"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
