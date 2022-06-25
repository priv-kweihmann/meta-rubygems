# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-transfer"
DESCRIPTION = "Official AWS Ruby gem for AWS Transfer Family (AWS Transfer)"
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

SRC_URI[md5sum] = "e0da7008f9b9e34ba705a5763cf4a0f0"
SRC_URI[sha256sum] = "6f6f1c9dfeccf47fe551fd8976992b774ece9e877ce5db83747830f1aa64266b"

GEM_NAME = "aws-sdk-transfer"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
