# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-ram"
DESCRIPTION = "Official AWS Ruby gem for AWS Resource Access Manager (RAM)"
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

SRC_URI[md5sum] = "4f88053803602b32c120b146d6edd9c2"
SRC_URI[sha256sum] = "5b20f9a85a516f6a64d2a4e64ab6121223e89868a9692c60ca75f6cdae2bad5e"

GEM_NAME = "aws-sdk-ram"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
