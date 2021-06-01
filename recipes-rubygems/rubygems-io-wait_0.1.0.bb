# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: io-wait"
DESCRIPTION = "Waits until IO is readable or writable without blocking."
HOMEPAGE = "https://github.com/ruby/io-wait"

LICENSE = "Ruby & BSD-2-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=5b8c87559868796979806100db3f3805"

SRC_URI[md5sum] = "ba958b140922e62e08c505dd44474ce0"
SRC_URI[sha256sum] = "dc68348039bd06ecd3c59ef67a7f021206684f4bc5182df27421b0665f64f787"

GEM_NAME = "io-wait"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
