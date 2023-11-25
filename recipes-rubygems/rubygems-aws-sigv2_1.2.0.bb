# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sigv2"
DESCRIPTION = "Amazon Web Services Signature Version 2 signing library"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "bf8563d7b604b0cda59e8d0960f99c19"
SRC_URI[sha256sum] = "32a06385ac19ce6e595152774dd93540ac92d0c55a2de488e6c5768c92d155fd"

GEM_NAME = "aws-sigv2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
