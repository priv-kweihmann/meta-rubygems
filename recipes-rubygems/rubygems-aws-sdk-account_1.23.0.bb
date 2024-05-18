# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-account"
DESCRIPTION = "Official AWS Ruby gem for AWS Account"
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

SRC_URI[md5sum] = "e41abfdc1f4e28891bdf03979ec11397"
SRC_URI[sha256sum] = "d8aefff54d3b691e976086ce05ed420ef93a6a663478c50841aa4869858edc78"

GEM_NAME = "aws-sdk-account"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
