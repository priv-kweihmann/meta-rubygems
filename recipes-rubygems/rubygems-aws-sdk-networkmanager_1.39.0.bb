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

SRC_URI[md5sum] = "fb0c7e3ea9db69253a8358b742b8aeb8"
SRC_URI[sha256sum] = "a4cd0f7b1bbf7884b82bb423367930480388ac60b647590004e27f2d5b52f7f8"

GEM_NAME = "aws-sdk-networkmanager"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
