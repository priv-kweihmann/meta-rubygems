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

SRC_URI[md5sum] = "f873e7c15f7428bf3ff86e219022d141"
SRC_URI[sha256sum] = "de0aa7ac0627ca59bbff250a32e04ce813ea7d0640e84dacd1476e6f393959e4"

GEM_NAME = "aws-sdk-elasticsearchservice"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
