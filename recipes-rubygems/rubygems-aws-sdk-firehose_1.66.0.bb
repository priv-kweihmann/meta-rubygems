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

SRC_URI[md5sum] = "f0f8e2ba0919c8d6c65570c5a34f8ff8"
SRC_URI[sha256sum] = "9b22c99f7b4101044b6274da68a0f23ac12c4974796a762c2b0c374c450e4f9f"

GEM_NAME = "aws-sdk-firehose"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
