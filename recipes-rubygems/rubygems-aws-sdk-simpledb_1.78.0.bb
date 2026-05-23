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

SRC_URI[md5sum] = "b2b92c0dd145f879e4b7447d7f50e8d5"
SRC_URI[sha256sum] = "3731682533593d1d52991a86e48a681f2a90eb08eb1f9526be31d51b16457cfb"

GEM_NAME = "aws-sdk-simpledb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv2 \
"

BBCLASSEXTEND = "native"
