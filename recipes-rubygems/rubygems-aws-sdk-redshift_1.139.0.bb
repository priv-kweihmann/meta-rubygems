# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-redshift"
DESCRIPTION = "Official AWS Ruby gem for Amazon Redshift"
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

SRC_URI[md5sum] = "f4f5e85828eda41c193cdcd7f1b7cd8e"
SRC_URI[sha256sum] = "221a52ae1aeb747958f82876462c14bcc1f864c7e0b9208f4adcb034c356b59a"

GEM_NAME = "aws-sdk-redshift"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
