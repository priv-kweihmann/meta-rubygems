# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-codedeploy"
DESCRIPTION = "Official AWS Ruby gem for AWS CodeDeploy (CodeDeploy)"
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

SRC_URI[md5sum] = "54941edd85d532ae7b666af56e1225d1"
SRC_URI[sha256sum] = "11f92dcb3917370d7eecbd35455fb7b8ca5900b74bbf2924d0f99a1d3aeb37e0"

GEM_NAME = "aws-sdk-codedeploy"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
