# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c91fd276349859aa639cd2b2caeae8e7"
SRC_URI[sha256sum] = "d033e21600e8c53c82063ddd69cd39ed2384ba88aabd6b12c8ddf2fa1ca13e26"

GEM_NAME = "aws-partitions"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
