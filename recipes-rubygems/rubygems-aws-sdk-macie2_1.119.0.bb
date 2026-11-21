# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-macie2"
DESCRIPTION = "Official AWS Ruby gem for Amazon Macie 2"
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

SRC_URI[md5sum] = "5d7c222852673225760408bac21e4316"
SRC_URI[sha256sum] = "5fa48bc961797e0ad363109857d402d67d95eaf0cb9c7fb17e48a10306575c40"

GEM_NAME = "aws-sdk-macie2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
