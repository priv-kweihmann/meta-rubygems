# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-glue"
DESCRIPTION = "Official AWS Ruby gem for AWS Glue"
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

SRC_URI[md5sum] = "f78f3b1e25f68e61bfcda96c409e0ccf"
SRC_URI[sha256sum] = "e883f3b774b89ced1bfe96584ced1ea201160a2b8c2d25253ac913e3424015f1"

GEM_NAME = "aws-sdk-glue"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
