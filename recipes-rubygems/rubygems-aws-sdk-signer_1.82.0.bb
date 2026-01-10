# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-signer"
DESCRIPTION = "Official AWS Ruby gem for AWS Signer (signer)"
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

SRC_URI[md5sum] = "af56ee60228ca16a788c8ad9671b46f8"
SRC_URI[sha256sum] = "1aa61d1a6ead89fd4f4761f4d3426cf2ccc47fd9cf7dde311019831374a4b4aa"

GEM_NAME = "aws-sdk-signer"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
