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

SRC_URI[md5sum] = "fdcbb04ca8e598221d476d34e3b704be"
SRC_URI[sha256sum] = "7a51871e6272fc4ce1efc7f6953bd0f8aa1ec1990b88bd0424473ca422d9dbc6"

GEM_NAME = "aws-sdk-networkfirewall"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
