# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-emr"
DESCRIPTION = "Official AWS Ruby gem for Amazon EMR"
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

SRC_URI[md5sum] = "fe7c9f99c8b2b3a3a0f6cfea7fe1c1fe"
SRC_URI[sha256sum] = "23f76773bbb37f993886656ca444ee662b702eddfb719da9b6aecb8b2cdc4d19"

GEM_NAME = "aws-sdk-emr"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
