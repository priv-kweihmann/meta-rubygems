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

SRC_URI[md5sum] = "1390b6fb7ad538915271c2c89ad04433"
SRC_URI[sha256sum] = "f883b9e9cbe7bfc54b14f4c68e1c7e0bb74350877b14178b01f96178c070db7c"

GEM_NAME = "aws-sdk-synthetics"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
