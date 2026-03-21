# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-simpledb"
DESCRIPTION = "Official AWS Ruby gem for Amazon SimpleDB"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv2-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "248559caa00d27ee37c00c99376d8876"
SRC_URI[sha256sum] = "d61bf0785b4e27d9c4ac5fa89ef14f2fe0f1bcabe38d651b4b422e192be9e5e8"

GEM_NAME = "aws-sdk-simpledb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv2 \
"

BBCLASSEXTEND = "native"
