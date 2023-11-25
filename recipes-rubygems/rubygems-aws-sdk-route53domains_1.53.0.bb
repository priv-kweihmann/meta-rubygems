# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-route53domains"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 Domains"
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

SRC_URI[md5sum] = "ca2bb8b56ccbdd26d447ea21716e1b3b"
SRC_URI[sha256sum] = "34d0607b78327d109826a1b2c557ab98489078e3186c73e07b21d6d096cb79a2"

GEM_NAME = "aws-sdk-route53domains"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
