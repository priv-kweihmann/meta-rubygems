# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-mq"
DESCRIPTION = "Official AWS Ruby gem for AmazonMQ"
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

SRC_URI[md5sum] = "a3ae7d99fff14e14f196ab95a0fa351a"
SRC_URI[sha256sum] = "f141c5a7b72755a74a041d937826041db8365f41beb2435936bc09bd22c8653a"

GEM_NAME = "aws-sdk-mq"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
