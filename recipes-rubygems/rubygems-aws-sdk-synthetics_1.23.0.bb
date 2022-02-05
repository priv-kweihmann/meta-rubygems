# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-synthetics"
DESCRIPTION = "Official AWS Ruby gem for Synthetics"
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

SRC_URI[md5sum] = "77907fb6f1c1162ee42dd29bda37dcb0"
SRC_URI[sha256sum] = "6d1c1931dc0be01954de9e1a4d36e8a4980505601970ac5632d38485a87f7fa9"

GEM_NAME = "aws-sdk-synthetics"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
