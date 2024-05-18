# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cloudhsm"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudHSM (CloudHSM)"
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

SRC_URI[md5sum] = "c20ca8587cb9d57237d2dab19fb164ae"
SRC_URI[sha256sum] = "aaa9134ebd6276ceb07174cf8710907358eb98388c7dd270ca7467d034fd07b9"

GEM_NAME = "aws-sdk-cloudhsm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
