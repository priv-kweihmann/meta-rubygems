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

SRC_URI[md5sum] = "3c2d0db7bf090d24f70084b793eeea23"
SRC_URI[sha256sum] = "3ef44b009df53273c146820b5816ab080da6b6547f9ea570b7acafe7b42182c8"

GEM_NAME = "aws-sdk-alexaforbusiness"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
