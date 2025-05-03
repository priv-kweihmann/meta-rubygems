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

SRC_URI[md5sum] = "98196619f97c73ec1eddc48d4b932c72"
SRC_URI[sha256sum] = "3b39f9e65fca715f546dd5a12e26f7d40f5fd14179eb8b020fb84c319b32d753"

GEM_NAME = "aws-sdk-shield"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
