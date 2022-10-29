# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-firehose"
DESCRIPTION = "Official AWS Ruby gem for Amazon Kinesis Firehose (Firehose)"
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

SRC_URI[md5sum] = "ca619ec7b880f9975dc888d0589a734e"
SRC_URI[sha256sum] = "0aa01a0d5845916517caee4e1677e54b12619af0fb3a1c0a6f11a9fb4ca3196e"

GEM_NAME = "aws-sdk-firehose"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
