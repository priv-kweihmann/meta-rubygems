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

SRC_URI[md5sum] = "6add97a1cc90eef342d6b41ca0821367"
SRC_URI[sha256sum] = "9bf279432aeb8073ea7cc3f797b4f2db526a82835c72dffcccdead9d1b7007d2"

GEM_NAME = "aws-sdk-secretsmanager"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
