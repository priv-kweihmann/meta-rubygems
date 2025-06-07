# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-elasticsearchservice"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elasticsearch Service"
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

SRC_URI[md5sum] = "ade1aa585754813a60249f43f31097ba"
SRC_URI[sha256sum] = "7c2b8f0fa2018c4536bc76e48faaee1fbcb64486de8143f5f6c6b1e4a5740d0b"

GEM_NAME = "aws-sdk-elasticsearchservice"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
