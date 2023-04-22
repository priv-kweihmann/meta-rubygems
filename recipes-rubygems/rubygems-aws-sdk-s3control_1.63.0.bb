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

SRC_URI[md5sum] = "5cbed01aa1cf3dec2ef17bc2d1c2edab"
SRC_URI[sha256sum] = "6304d43f7a92955789e12c0945a4f01f7f774f99a5a29ccb886734bb0bb4cd04"

GEM_NAME = "aws-sdk-s3control"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
