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

SRC_URI[md5sum] = "c64525c7b5499f70c91da388b3977bb3"
SRC_URI[sha256sum] = "f3e18dbd63f35e1032914ade7634d8bc779f153201ca519eb83d964c61507530"

GEM_NAME = "aws-sdk-costandusagereportservice"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
