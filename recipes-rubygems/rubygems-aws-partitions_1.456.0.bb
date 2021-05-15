# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-partitions"
DESCRIPTION = "Provides interfaces to enumerate AWS partitions, regions, and services."
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI[md5sum] = "24816915487a2206df74b06f3c1dd822"
SRC_URI[sha256sum] = "02a60f14390425f8464c774f23d55e32fc3f5fe48edd6e16ad8f8728ea9fa6bc"

GEM_NAME = "aws-partitions"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
