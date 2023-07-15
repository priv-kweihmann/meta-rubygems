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

SRC_URI[md5sum] = "d4fe6dc52ffcb9a570cb0584b55c4e35"
SRC_URI[sha256sum] = "93ca3351a6bcff4811f00ad9cf5071085699f1f37bae0f3e1dfb23f7d71f97d4"

GEM_NAME = "aws-sdk-alexaforbusiness"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
