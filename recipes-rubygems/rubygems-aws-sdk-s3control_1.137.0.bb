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

SRC_URI[md5sum] = "8a1a06e86b005381000c71900d252180"
SRC_URI[sha256sum] = "355c0385a8ed9d6f991ce721bbf5a0b782fc0ab96fcf7d613575c5fcfd8cd2fa"

GEM_NAME = "aws-sdk-s3control"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
