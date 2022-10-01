# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: slop"
DESCRIPTION = "A DSL for gathering options and parsing command line flags"
HOMEPAGE = "http://github.com/leejarvis/slop"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40575ded674b04c083ce6818c01f0282"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1d1548cf81f5546ce51179f482c276bb"
SRC_URI[sha256sum] = "6e26dfdb549f45d75f5f843f4c1b6267f34b6604ca8303086946f97ff275e933"

GEM_NAME = "slop"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
