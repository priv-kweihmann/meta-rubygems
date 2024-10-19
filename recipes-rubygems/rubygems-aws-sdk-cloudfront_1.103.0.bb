# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cloudfront"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudFront (CloudFront)"
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

SRC_URI[md5sum] = "79c10a95df590e139e8d6fa5bef2c0eb"
SRC_URI[sha256sum] = "5d8319d1dc85c9512361de4df6511bd2cc3f1622f789c5eec1a3f850100d93e5"

GEM_NAME = "aws-sdk-cloudfront"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
