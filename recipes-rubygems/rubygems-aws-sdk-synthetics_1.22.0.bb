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

SRC_URI[md5sum] = "637ae6b8ed61276d2961e745e7077cc9"
SRC_URI[sha256sum] = "ac2c2c266adde554a6dbf3a99649878f48b0970e96ec30555514c8ee4c3c8026"

GEM_NAME = "aws-sdk-synthetics"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
