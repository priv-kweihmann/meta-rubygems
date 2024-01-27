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

SRC_URI[md5sum] = "5f7985d698eec41106c0dfdf1d1f4470"
SRC_URI[sha256sum] = "873cfeacaa02dbbdaf31aa470b844ebd62886bad5a8438aa32e124b32b89306c"

GEM_NAME = "aws-sdk-simpledb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv2 \
"

BBCLASSEXTEND = "native"
