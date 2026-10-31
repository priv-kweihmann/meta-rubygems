# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-shield"
DESCRIPTION = "Official AWS Ruby gem for AWS Shield"
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

SRC_URI[md5sum] = "82e9067ecc14c014c3c96a17ca7332c1"
SRC_URI[sha256sum] = "2d429f4d5ebaa5f31e3b91e901a5ffbc7e58761a2e32938bbfe9f161c02db6c8"

GEM_NAME = "aws-sdk-shield"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
