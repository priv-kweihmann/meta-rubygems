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

SRC_URI[md5sum] = "1b85a82301e24802cfb529343cc4e835"
SRC_URI[sha256sum] = "db6df6e091d55f481f6db2c2d6dec3294bd91be5059d89a7d4f92f057ca74044"

GEM_NAME = "aws-sdk-elasticsearchservice"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
