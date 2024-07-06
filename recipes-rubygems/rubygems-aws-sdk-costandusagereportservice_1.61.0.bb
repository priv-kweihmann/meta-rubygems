# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-costandusagereportservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Cost and Usage Report Service"
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

SRC_URI[md5sum] = "6d08abd68988c481f5e7ed5af7fedcd9"
SRC_URI[sha256sum] = "9b080aa1627260f4460d7d5f7d4065a1157c6f8dedf5fceb03de605d530eef8a"

GEM_NAME = "aws-sdk-costandusagereportservice"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
