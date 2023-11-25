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

SRC_URI[md5sum] = "221bd3a93792e0981ff50858effb18c8"
SRC_URI[sha256sum] = "ca1fdd2a7de51056d09b9ebdab9e0d27d2f859621a549eba2388b42d8e49a74e"

GEM_NAME = "aws-sigv4"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-eventstream \
"

BBCLASSEXTEND = "native"
