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

SRC_URI[md5sum] = "e4562ef7a26317b10125d90f6aa12dcc"
SRC_URI[sha256sum] = "e0c746eac2df756ca2356a8aa73fe6d07290d7ba2e1bd572dcca5c6ab476e8d3"

GEM_NAME = "aws-sdk-elasticsearchservice"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
