# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-eventbridge"
DESCRIPTION = "Official AWS Ruby gem for Amazon EventBridge"
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

SRC_URI[md5sum] = "ca41ce1034cf647087c1a41bed84c1cf"
SRC_URI[sha256sum] = "50c2da4a9b3ea2624877e6374b0d3057462838e824583ea38d7218f9a208001f"

GEM_NAME = "aws-sdk-eventbridge"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
