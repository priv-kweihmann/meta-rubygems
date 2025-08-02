# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-ram"
DESCRIPTION = "Official AWS Ruby gem for AWS Resource Access Manager (RAM)"
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

SRC_URI[md5sum] = "de5fc2e1b09ffbb3f2dd5e599fd6022e"
SRC_URI[sha256sum] = "4900ffcdc1fc08cc018c103c5937821b18451aaccbc1af2c0c98ac90c4c46f8b"

GEM_NAME = "aws-sdk-ram"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
