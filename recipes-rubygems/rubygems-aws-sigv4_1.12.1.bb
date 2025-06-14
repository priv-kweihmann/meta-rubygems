# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sigv4"
DESCRIPTION = "Amazon Web Services Signature Version 4 signing library"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-aws-eventstream-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ac2a02660c1a5ec16f91968f36436651"
SRC_URI[sha256sum] = "6973ff95cb0fd0dc58ba26e90e9510a2219525d07620c8babeb70ef831826c00"

GEM_NAME = "aws-sigv4"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-eventstream \
"

BBCLASSEXTEND = "native"
