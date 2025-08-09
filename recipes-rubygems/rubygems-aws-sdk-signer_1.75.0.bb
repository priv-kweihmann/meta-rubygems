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

SRC_URI[md5sum] = "0e90e35a8dc5763be90841c62afe2326"
SRC_URI[sha256sum] = "cf57061bbd5ec0b54b39a9213543ebbabd931c000d57c469dc5bf4aed4e3e15e"

GEM_NAME = "aws-sdk-signer"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
