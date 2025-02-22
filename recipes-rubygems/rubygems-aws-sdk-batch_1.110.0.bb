# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-batch"
DESCRIPTION = "Official AWS Ruby gem for AWS Batch"
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

SRC_URI[md5sum] = "72631321089e70bdd5ad9596bdbea729"
SRC_URI[sha256sum] = "dcea4bea052392c6bc468a880ac729adc811b24b311d98a45f8c850e5d0d4d25"

GEM_NAME = "aws-sdk-batch"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
