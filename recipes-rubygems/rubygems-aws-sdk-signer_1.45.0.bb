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

SRC_URI[md5sum] = "62d69f13a36e1852792ad7bb8e761772"
SRC_URI[sha256sum] = "7a22b5775381bb33c470901b3de8b84e65e63d60077700cda1dda78b690b0beb"

GEM_NAME = "aws-sdk-signer"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
