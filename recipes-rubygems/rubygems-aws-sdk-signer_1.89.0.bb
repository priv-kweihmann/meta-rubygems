# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-signer"
DESCRIPTION = "Official AWS Ruby gem for AWS Signer (signer)"
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

SRC_URI[md5sum] = "e410c77f35c45600c260832d7151fd95"
SRC_URI[sha256sum] = "110aac033ed66e25306adb498fc103e68213df357ad0ee81a45127d1610cca66"

GEM_NAME = "aws-sdk-signer"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
