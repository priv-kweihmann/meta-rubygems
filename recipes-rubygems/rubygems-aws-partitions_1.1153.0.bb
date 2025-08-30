# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5d5cc48db01f054032b18f06d5ec72f0"
SRC_URI[sha256sum] = "545fa62d2fc6a893dffb6e47947b8dffb9d829d2767410335197bbaa6d11d722"

GEM_NAME = "aws-partitions"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
