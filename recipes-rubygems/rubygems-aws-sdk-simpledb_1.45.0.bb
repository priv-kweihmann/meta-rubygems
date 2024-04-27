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

SRC_URI[md5sum] = "bf1fd6b6836b960346c67f595323229a"
SRC_URI[sha256sum] = "f319dd8d6e6590ddd6b75ddd1efae2977725f738cd8bdd56a6a6c3adce1943e9"

GEM_NAME = "aws-sdk-simpledb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv2 \
"

BBCLASSEXTEND = "native"
