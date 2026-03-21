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

SRC_URI[md5sum] = "f94966b05800c46ccd217fcb550f76e3"
SRC_URI[sha256sum] = "113fd626c249c08f60a24825700a8e895ffeaad6bc1eaeb3429e6dd237e5b654"

GEM_NAME = "aws-sdk-networkmanager"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
