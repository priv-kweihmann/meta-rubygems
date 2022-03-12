# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-lambda"
DESCRIPTION = "Official AWS Ruby gem for AWS Lambda"
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

SRC_URI[md5sum] = "b3967bbdce3e40d2cbb3cafb8661d86f"
SRC_URI[sha256sum] = "f8536e8ebf2b1aa38eed8879676b9383a09a9ddf4dc2a7a7aeeda600b3258821"

GEM_NAME = "aws-sdk-lambda"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
