# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cloudtrail"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudTrail (CloudTrail)"
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

SRC_URI[md5sum] = "d5d945b502172e7612052fa9dfc85470"
SRC_URI[sha256sum] = "31e9fad6a706c287fe59f4c2be1cc6c5062cf58be35ac738c08ae4320d9e9343"

GEM_NAME = "aws-sdk-cloudtrail"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
