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

SRC_URI[md5sum] = "1127c65207fdfaf1f47aeda8cb1af15c"
SRC_URI[sha256sum] = "90e1d6307065fa4ee3f72e231043846f89ad520b0211c770f51ceafece6596e4"

GEM_NAME = "aws-sdk-cloudhsmv2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
