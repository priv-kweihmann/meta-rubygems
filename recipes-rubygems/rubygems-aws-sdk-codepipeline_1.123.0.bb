# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-codepipeline"
DESCRIPTION = "Official AWS Ruby gem for AWS CodePipeline (CodePipeline)"
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

SRC_URI[md5sum] = "d4a5fde7ffa246bd9c5df0b2aec60df3"
SRC_URI[sha256sum] = "31d8209f01a89c5bc5976711760beea688de762f18a3a5f39f8943e51d455336"

GEM_NAME = "aws-sdk-codepipeline"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
