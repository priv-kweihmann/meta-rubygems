# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1a6d9bc06fb760108b4ab5247edabf30"
SRC_URI[sha256sum] = "f300149dfeb36d74926447ceaa24f9e04d1ae6708e76932eae396c23ad79dcea"

GEM_NAME = "aws-partitions"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
