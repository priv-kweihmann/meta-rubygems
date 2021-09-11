# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-eventstream"
DESCRIPTION = "Amazon Web Services event stream library"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "47689acbf31e71cd5fb3877cce3d9d58"
SRC_URI[sha256sum] = "ffa53482c92880b001ff2fb06919b9bb82fd847cbb0fa244985d2ebb6dd0d1df"

GEM_NAME = "aws-eventstream"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
