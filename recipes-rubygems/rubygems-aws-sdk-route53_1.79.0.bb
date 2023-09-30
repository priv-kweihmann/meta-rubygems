# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-route53"
DESCRIPTION = "Official AWS Ruby gem for Amazon Route 53 (Route 53)"
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

SRC_URI[md5sum] = "a90fb8aa4b86dc075a432ae3ffedaa8c"
SRC_URI[sha256sum] = "46d4e54c8375bf2dc8046b2fae5298fd64c2d2755974677d772d880214a89458"

GEM_NAME = "aws-sdk-route53"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
