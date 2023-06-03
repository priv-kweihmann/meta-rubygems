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

SRC_URI[md5sum] = "a4799359560c1f7dcdd3f1586e35717d"
SRC_URI[sha256sum] = "83d89e1d292b023506b4d3750c5438cd9937bd4febdbe36797032dcc07a6359f"

GEM_NAME = "aws-sdk-synthetics"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
