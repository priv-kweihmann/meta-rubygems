# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-s3control"
DESCRIPTION = "Official AWS Ruby gem for AWS S3 Control"
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

SRC_URI[md5sum] = "dfccaa46770bae019b2f7bcac1d27ff1"
SRC_URI[sha256sum] = "f4960c56e04542d5a9fa7738c56bcd527df0830d111894b6f1b0948cecc21bd3"

GEM_NAME = "aws-sdk-s3control"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"