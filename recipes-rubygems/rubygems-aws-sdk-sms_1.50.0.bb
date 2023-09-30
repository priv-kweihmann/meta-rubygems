# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-sms"
DESCRIPTION = "Official AWS Ruby gem for AWS Server Migration Service (SMS)"
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

SRC_URI[md5sum] = "859b00430e729fe9450eb35a53446fef"
SRC_URI[sha256sum] = "fd4aa7bb728c11af1987159bf45c67e03e25603ebff5cd0b5255666dc8d9da46"

GEM_NAME = "aws-sdk-sms"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
