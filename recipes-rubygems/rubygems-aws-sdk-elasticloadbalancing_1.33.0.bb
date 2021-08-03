# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-elasticloadbalancing"
DESCRIPTION = "Official AWS Ruby gem for Elastic Load Balancing"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS:class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv4-native \
"

SRC_URI[md5sum] = "72cb209e45caab3c7e04a9a76834117c"
SRC_URI[sha256sum] = "6e0ff4214ac26587bebb4f443594d0d2956ad11ab908777ca7db659926604a15"

GEM_NAME = "aws-sdk-elasticloadbalancing"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
