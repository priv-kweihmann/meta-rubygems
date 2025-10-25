# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-route53resolver"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 Resolver (Route53Resolver)"
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

SRC_URI[md5sum] = "f0bdaca9eeaa88d04a2b66097502c727"
SRC_URI[sha256sum] = "d893b41ce4c63d51c91f5093b60ca6a00bb66e04e8887b9762e4c17811f7e139"

GEM_NAME = "aws-sdk-route53resolver"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
