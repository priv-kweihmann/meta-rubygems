# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-networkmanager"
DESCRIPTION = "Official AWS Ruby gem for AWS Network Manager (NetworkManager)"
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

SRC_URI[md5sum] = "0dcdf42489447939ce4a3b34d769aa87"
SRC_URI[sha256sum] = "e8c04998b2e86dc7243644fe2c72ee5fe993b7205b6484af6d5cb8abacb564a3"

GEM_NAME = "aws-sdk-networkmanager"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
