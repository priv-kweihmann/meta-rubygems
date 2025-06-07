# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-eventstream"
DESCRIPTION = "Amazon Web Services event stream library"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "94f30a4b242a59c50d6cb89982494017"
SRC_URI[sha256sum] = "116bf85c436200d1060811e6f5d2d40c88f65448f2125bc77ffce5121e6e183b"

GEM_NAME = "aws-eventstream"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
