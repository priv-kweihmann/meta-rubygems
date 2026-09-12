# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-codecommit"
DESCRIPTION = "Official AWS Ruby gem for AWS CodeCommit (CodeCommit)"
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

SRC_URI[md5sum] = "3c1b8119f0c9fd2ef40ca6b96a889f1c"
SRC_URI[sha256sum] = "7c32fd0f62c42ebbb24950421131c4161ae429c9cbf9b663a36c75fa9b996e75"

GEM_NAME = "aws-sdk-codecommit"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
