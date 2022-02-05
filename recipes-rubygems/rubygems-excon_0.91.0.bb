# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: excon"
DESCRIPTION = "EXtended http(s) CONnections"
HOMEPAGE = "https://github.com/excon/excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8b04a0291ec55b31563a50b191b72cb1"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2697bbc0dc832b1ef6ec5de083c064f3"
SRC_URI[sha256sum] = "e47408ada7784a8eea4faa3b779127c609cb1fb024b6da12bc6cadf02dc8210d"

GEM_NAME = "excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
