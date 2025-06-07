# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sigv2"
DESCRIPTION = "Amazon Web Services Signature Version 2 signing library"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2134ca5aafb0d52943927fe95899929c"
SRC_URI[sha256sum] = "e004339025e739e89551c878d73180aa8744e3e8b6aaca0125fe3edf4606eeb6"

GEM_NAME = "aws-sigv2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
