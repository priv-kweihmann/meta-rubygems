# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-eks"
DESCRIPTION = "Official AWS Ruby gem for Amazon Elastic Kubernetes Service (Amazon EKS)"
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

SRC_URI[md5sum] = "1ce86f8179a0647e4857a18be838539a"
SRC_URI[sha256sum] = "21bda9ccfcf4115dd906679ff01f59f9cf59f9040cd8203dee4193f35b19c864"

GEM_NAME = "aws-sdk-eks"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
