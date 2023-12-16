# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f382faeae0441335547432f79fab4661"
SRC_URI[sha256sum] = "7d79cddb966d0766c3c36138e6b4cee59f5429cc3a8ef87432df9091bcea5df1"

GEM_NAME = "aws-partitions"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
