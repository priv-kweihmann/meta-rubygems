# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-guardduty"
DESCRIPTION = "Official AWS Ruby gem for Amazon GuardDuty"
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

SRC_URI[md5sum] = "475611eb56b70e5f7218edbae84494c8"
SRC_URI[sha256sum] = "4ebf1f6030994ab9b17e9450c90696ba49e28d3c5a4ad80f2edf3637bb5d5798"

GEM_NAME = "aws-sdk-guardduty"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
