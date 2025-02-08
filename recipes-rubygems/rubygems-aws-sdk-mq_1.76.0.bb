# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-mq"
DESCRIPTION = "Official AWS Ruby gem for AmazonMQ"
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

SRC_URI[md5sum] = "b4c19800c46de6c5f6357693921189b9"
SRC_URI[sha256sum] = "19a7f8223c028a3669d29aa4007706fc2256ce661a21e4f74e4a1f5457155363"

GEM_NAME = "aws-sdk-mq"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
