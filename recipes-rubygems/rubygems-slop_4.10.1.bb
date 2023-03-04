# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: slop"
DESCRIPTION = "A DSL for gathering options and parsing command line flags"
HOMEPAGE = "http://github.com/leejarvis/slop"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40575ded674b04c083ce6818c01f0282"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9cdc41fa13227c6a755ceb392854f786"
SRC_URI[sha256sum] = "844322b5ffcf17ed4815fdb173b04a20dd82b4fd93e3744c88c8fafea696d9c7"

GEM_NAME = "slop"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
