# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-synthetics"
DESCRIPTION = "Official AWS Ruby gem for Synthetics"
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

SRC_URI[md5sum] = "54ce6b33593307bfa30ecd801186b0d2"
SRC_URI[sha256sum] = "163eb71e27b412bf8c065ada461d8efdcc4d5775a822a9bc6b2405eba5b2e1c9"

GEM_NAME = "aws-sdk-synthetics"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
