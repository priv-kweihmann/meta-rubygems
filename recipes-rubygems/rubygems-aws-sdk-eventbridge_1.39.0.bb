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

SRC_URI[md5sum] = "ed15ea076bc2e4741b3857b3db914f37"
SRC_URI[sha256sum] = "fb0fcdc9124eaa3a4e28adf0b90de1dce1eb2da91abc55f4d2831a820855b84c"

GEM_NAME = "aws-sdk-eventbridge"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
