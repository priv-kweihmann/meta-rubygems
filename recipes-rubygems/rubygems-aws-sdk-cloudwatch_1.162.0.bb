# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cloudwatch"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch (CloudWatch)"
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

SRC_URI[md5sum] = "f58ee0a81ff3116a23250d69203916f5"
SRC_URI[sha256sum] = "c94ca4d1d095bebf27143cd1e743f5f9e5b6b3a061ad7a2fed25033d7fb4c6f8"

GEM_NAME = "aws-sdk-cloudwatch"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
