# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-securityhub"
DESCRIPTION = "Official AWS Ruby gem for AWS SecurityHub"
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

SRC_URI[md5sum] = "1c8b39b4a0fc937ea4f02f6dc785c1f6"
SRC_URI[sha256sum] = "94a88f582547c4a5906f2d59f59dfef85db5bb211802977e88d0c17d33b40c5e"

GEM_NAME = "aws-sdk-securityhub"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
