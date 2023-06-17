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

SRC_URI[md5sum] = "19ea9ae8539f6f5bb4f94f677d9d1560"
SRC_URI[sha256sum] = "b1142fd0ec64a90a56e04a7f25bc53858ec6f76793664fd6e5d5b814aab25d05"

GEM_NAME = "aws-sdk-alexaforbusiness"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
