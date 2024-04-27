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

SRC_URI[md5sum] = "b41dd41fb2794b95dd5a9ccb5138c648"
SRC_URI[sha256sum] = "26389b43436c1e99c9bed16dcfc95fe383613a275c4ccd0716252de9a2bd477c"

GEM_NAME = "aws-sdk-alexaforbusiness"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
