# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-route53"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 (Route 53)"
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

SRC_URI[md5sum] = "7c42f9e9d112b2c66272a272f5cee322"
SRC_URI[sha256sum] = "37e71157e8a9ca3e7428c47cf6535c1d82ec01a7dbffbccbd8030da43597563e"

GEM_NAME = "aws-sdk-route53"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
