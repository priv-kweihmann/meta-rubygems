# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rb-fsevent"
DESCRIPTION = "FSEvents API with Signals catching (without RubyCocoa)"
HOMEPAGE = "http://rubygems.org/gems/rb-fsevent"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0f54ca712fa5d09964ad633d7ab46d36"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5114395e7fc9a60822ee7edf50569be9"
SRC_URI[sha256sum] = "43900b972e7301d6570f64b850a5aa67833ee7d87b458ee92805d56b7318aefe"

GEM_NAME = "rb-fsevent"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
