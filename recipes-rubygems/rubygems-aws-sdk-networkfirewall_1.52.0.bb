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

SRC_URI[md5sum] = "9d6ab25d16517d38f4095c305466069c"
SRC_URI[sha256sum] = "32bbe98383dc153d217b7ea845f66cf296ef6e4950de1496f0d57ea90552327c"

GEM_NAME = "aws-sdk-networkfirewall"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
