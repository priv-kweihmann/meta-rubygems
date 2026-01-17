# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-athena"
DESCRIPTION = "Official AWS Ruby gem for Amazon Athena"
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

SRC_URI[md5sum] = "18a1120a7bdb2ff7fa1e9fc2f8bbf314"
SRC_URI[sha256sum] = "f98915c3c7e30e5f1c2b17c4d378b845177a133d7244f98fa540784bc9058a26"

GEM_NAME = "aws-sdk-athena"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
