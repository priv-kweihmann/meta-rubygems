# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: slop"
DESCRIPTION = "A DSL for gathering options and parsing command line flags"
HOMEPAGE = "http://github.com/leejarvis/slop"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40575ded674b04c083ce6818c01f0282"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b2b772fe54a74763e640a2a85780e660"
SRC_URI[sha256sum] = "eb32e818276894039e44519958a4b28f1e80ee2d6d09670683ba11674e835514"

GEM_NAME = "slop"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
