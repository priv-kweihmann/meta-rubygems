# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sigv2"
DESCRIPTION = "Amazon Web Services Signature Version 2 signing library"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9f8dd3f5db32de6845f750034b39b618"
SRC_URI[sha256sum] = "33c3d5eab3af3ef5a16cb02e00e67dbe49c6487a12769cbd7ae383b68de0daae"

GEM_NAME = "aws-sigv2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
