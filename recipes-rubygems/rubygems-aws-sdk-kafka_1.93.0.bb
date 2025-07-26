# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-kafka"
DESCRIPTION = "Official AWS Ruby gem for Managed Streaming for Kafka (Kafka)"
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

SRC_URI[md5sum] = "293361a184d3ee4382c5aad9ae00f742"
SRC_URI[sha256sum] = "6d8569a079e301edf93a4be93894dda7c9374b44c9cf04626aaf40b5d2fba259"

GEM_NAME = "aws-sdk-kafka"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
