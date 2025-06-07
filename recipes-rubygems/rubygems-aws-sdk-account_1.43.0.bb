# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-account"
DESCRIPTION = "Official AWS Ruby gem for AWS Account"
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

SRC_URI[md5sum] = "45a7e4eb86dad223862e59ccf2ff795d"
SRC_URI[sha256sum] = "1c038c4bf12f14596d331049701cd7f95a12df18081b4726d1c9bf9a11c28bcd"

GEM_NAME = "aws-sdk-account"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
