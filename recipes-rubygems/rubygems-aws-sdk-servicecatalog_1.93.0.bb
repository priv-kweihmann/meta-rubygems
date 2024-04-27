# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-servicecatalog"
DESCRIPTION = "Official AWS Ruby gem for AWS Service Catalog"
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

SRC_URI[md5sum] = "1dceb5ac67dc8d99e97898f89db97f94"
SRC_URI[sha256sum] = "e519216d565622046d8d0daa1a3fb5bf38d2e2a03d4eee2c4b2d100aa967f5e4"

GEM_NAME = "aws-sdk-servicecatalog"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
