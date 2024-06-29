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

SRC_URI[md5sum] = "860fa7d2be627782cbda594b535c8366"
SRC_URI[sha256sum] = "eecdef5e3c06f8b411a1bded91a93b2ea789dd39525d4419a70757252010f779"

GEM_NAME = "aws-sdk-s3control"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
"

BBCLASSEXTEND = "native"
