# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-eventstream"
DESCRIPTION = "Amazon Web Services event stream library"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f59452f50120d9afa2a1e050bf8085ed"
SRC_URI[sha256sum] = "ceb6a99c61df4bb00344e54aed0351574beca24f87a0d1487d1d2ed80929ce96"

GEM_NAME = "aws-eventstream"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
