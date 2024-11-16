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

SRC_URI[md5sum] = "77730935226f1885edb3c2f0a6e4021b"
SRC_URI[sha256sum] = "102e2fb362fb99aaf13d475ff96666b2527fe5b7d6fa8c5cfa94eafbe002e790"

GEM_NAME = "aws-sdk-route53resolver"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
