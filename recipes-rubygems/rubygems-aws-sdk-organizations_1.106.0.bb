# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-organizations"
DESCRIPTION = "Official AWS Ruby gem for AWS Organizations (Organizations)"
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

SRC_URI[md5sum] = "4d03aae748d8af8803b29c67240db3e1"
SRC_URI[sha256sum] = "f817d3bb49995e1ab5d450c5b58fc2163aa037fe9cf40c18ffb5a151e670f3ba"

GEM_NAME = "aws-sdk-organizations"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
