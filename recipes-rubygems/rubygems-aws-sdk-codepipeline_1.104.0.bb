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

SRC_URI[md5sum] = "36c9a10ebb1a039916323c5c9693d472"
SRC_URI[sha256sum] = "f7d040fc0543906181caa75063114de86e03b17e0d09acfca513c29905bbee0c"

GEM_NAME = "aws-sdk-codepipeline"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
