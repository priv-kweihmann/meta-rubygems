# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-account"
DESCRIPTION = "Official AWS Ruby gem for AWS Account"
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

SRC_URI[md5sum] = "bf11062de3b484ae2800e8938ba35f72"
SRC_URI[sha256sum] = "946b7f4488704e4d64cc0b55092bafbc063f1e6d5e5ad5f665dd5035b512ed82"

GEM_NAME = "aws-sdk-account"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"
