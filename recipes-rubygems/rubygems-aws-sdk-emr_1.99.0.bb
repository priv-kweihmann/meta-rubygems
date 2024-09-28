# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-emr"
DESCRIPTION = "Official AWS Ruby gem for Amazon EMR"
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

SRC_URI[md5sum] = "d8f09479251c7e20804dea4af187edc0"
SRC_URI[sha256sum] = "6d54f01356c4ba88b524a89918787e83d7969334cee7314a2c07a323444f52a7"

GEM_NAME = "aws-sdk-emr"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
