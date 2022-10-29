# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-states"
DESCRIPTION = "Official AWS Ruby gem for AWS Step Functions (AWS SFN)"
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

SRC_URI[md5sum] = "42b2bc3e0c899759af15aeb92755f740"
SRC_URI[sha256sum] = "87ddad284f7848aab0cc0e2b14b72cd0a35fd85ff48b7c35f1bb83c1e8a55b5f"

GEM_NAME = "aws-sdk-states"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
