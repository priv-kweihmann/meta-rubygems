# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-emr"
DESCRIPTION = "Official AWS Ruby gem for Amazon EMR"
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

SRC_URI[md5sum] = "b17239d4f1301530832d4948231f4736"
SRC_URI[sha256sum] = "19e7ecb53378a5cc40fe2b07d0d970cd3aad93f5184521d21d4053b07a4aa53e"

GEM_NAME = "aws-sdk-emr"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
