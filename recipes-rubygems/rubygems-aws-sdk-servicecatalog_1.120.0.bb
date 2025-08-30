# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-servicecatalog"
DESCRIPTION = "Official AWS Ruby gem for AWS Service Catalog"
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

SRC_URI[md5sum] = "7f051683972e72aa4dbaa2ba81853f45"
SRC_URI[sha256sum] = "204a41500c2096fd919efed2db280bdef184ea14e72ae38b58f5cc8e5a446206"

GEM_NAME = "aws-sdk-servicecatalog"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
