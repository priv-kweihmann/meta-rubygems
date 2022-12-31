# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-secretsmanager"
DESCRIPTION = "Official AWS Ruby gem for AWS Secrets Manager"
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

SRC_URI[md5sum] = "8d4849d317104d6dad9d2a3310a65e91"
SRC_URI[sha256sum] = "b2c324ec416c9de61253a95dec477acf88a6e0b1d512810e33c4252adfda3951"

GEM_NAME = "aws-sdk-secretsmanager"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
