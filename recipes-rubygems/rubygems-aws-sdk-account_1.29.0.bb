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

SRC_URI[md5sum] = "67d1a744d7aa7d101fbd19eab71d8a42"
SRC_URI[sha256sum] = "4a67142f99f637623eceb2eefc49b9086bb1998e2b0637c1b918623d8ed03f2d"

GEM_NAME = "aws-sdk-account"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
