# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-eventbridge"
DESCRIPTION = "Official AWS Ruby gem for Amazon EventBridge"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS:class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv4-native \
"

SRC_URI[md5sum] = "72fe9597a607dc83490bc17b328c9343"
SRC_URI[sha256sum] = "0388dc0276926cd7cb407a7354731b08540da93387269120ecb29a949fab43bf"

GEM_NAME = "aws-sdk-eventbridge"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
