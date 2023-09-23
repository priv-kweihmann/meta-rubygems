# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-cloudhsmv2"
DESCRIPTION = "Official AWS Ruby gem for AWS CloudHSM V2 (CloudHSM V2)"
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

SRC_URI[md5sum] = "f170d215beb29918f6437eecd1139ecd"
SRC_URI[sha256sum] = "ff5ee3e575fb275df93a7dcde9eb5835a56c0e1981b0a8d11822364d8e7360ff"

GEM_NAME = "aws-sdk-cloudhsmv2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
