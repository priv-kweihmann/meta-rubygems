# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-eventstream"
DESCRIPTION = "Amazon Web Services event stream library"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "70b6ceebae28076881df36ee0292a2ef"
SRC_URI[sha256sum] = "4465b2add71d69a36fb1268a738d9b3d1a593c789e0286f28fad38e132d4403b"

GEM_NAME = "aws-eventstream"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
