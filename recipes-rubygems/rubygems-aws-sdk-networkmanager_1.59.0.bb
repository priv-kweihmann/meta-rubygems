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

SRC_URI[md5sum] = "8c01d9ad82f799d428f96783a6c5521c"
SRC_URI[sha256sum] = "ff7e4ed755ab1ed8680109615b3843e7dd92eda1bd93e88db476ba85729b7450"

GEM_NAME = "aws-sdk-networkmanager"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
