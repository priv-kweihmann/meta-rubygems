# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sigv2"
DESCRIPTION = "Amazon Web Services Signature Version 2 signing library"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3dbab625d6dfb167bf7e32a6ed144f3c"
SRC_URI[sha256sum] = "dd7b72e867d611a0da310ebd8bee2071c6c9d4cc70f7e3d2526d1c1fa24c9410"

GEM_NAME = "aws-sigv2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
