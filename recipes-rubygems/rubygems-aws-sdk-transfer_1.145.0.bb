# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-transfer"
DESCRIPTION = "Official AWS Ruby gem for AWS Transfer Family (AWS Transfer)"
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

SRC_URI[md5sum] = "5deea1b07402e5b83e34ec82d6cf111b"
SRC_URI[sha256sum] = "fef142b52a2e910f4c069995489743095c1e6a5b02e42ad38ea96465569a04b5"

GEM_NAME = "aws-sdk-transfer"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
