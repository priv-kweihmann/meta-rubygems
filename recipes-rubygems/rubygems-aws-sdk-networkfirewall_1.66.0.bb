# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-networkfirewall"
DESCRIPTION = "Official AWS Ruby gem for AWS Network Firewall (Network Firewall)"
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

SRC_URI[md5sum] = "64187ae0aa9bad0781ae42a7d3f69f20"
SRC_URI[sha256sum] = "1dde4598c9cbc86819d444cdac99ede13715f0ba76aaa323d9a3bdf2e29dab90"

GEM_NAME = "aws-sdk-networkfirewall"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
