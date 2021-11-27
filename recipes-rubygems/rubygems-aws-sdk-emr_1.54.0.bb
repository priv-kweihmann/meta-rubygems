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

SRC_URI[md5sum] = "622de8d45ba440afda883240a42648f9"
SRC_URI[sha256sum] = "26003f13583f552be7b8cddf14e318cb7e675c4b2528cebda97080c7fb162d5a"

GEM_NAME = "aws-sdk-emr"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
