# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-emr"
DESCRIPTION = "Official AWS Ruby gem for Amazon EMR"
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

SRC_URI[md5sum] = "04af01e687a4346981efce9dea47ecec"
SRC_URI[sha256sum] = "773c299b09a4ef98c997acc2e663690280ea06df1d909fcd8ada95d5125149e2"

GEM_NAME = "aws-sdk-emr"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
