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
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f352ee65875bef9df61171c1e3e2ace5"
SRC_URI[sha256sum] = "aa7097b6ff30f9c75fdc4ea9718f86423589b64454e5229175e357dd43e11e25"

GEM_NAME = "aws-sdk-s3control"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
"

BBCLASSEXTEND = "native"
