# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-eventbridge"
DESCRIPTION = "Official AWS Ruby gem for Amazon EventBridge"
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

SRC_URI[md5sum] = "a1550c4319a38f473681688b8e3fb9f8"
SRC_URI[sha256sum] = "5dc35cf0432010638e9223c4d68e8e6f598135109cb17968892551d6849f678c"

GEM_NAME = "aws-sdk-eventbridge"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
