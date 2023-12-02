# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: excon"
DESCRIPTION = "EXtended http(s) CONnections"
HOMEPAGE = "https://github.com/excon/excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8b04a0291ec55b31563a50b191b72cb1"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "45d168b5c80baccb49b0242e38bb0e5d"
SRC_URI[sha256sum] = "d1df317200cb2db38037d5df1075614685f0bfd6d7fa3650451bdb92168a0f8d"

GEM_NAME = "excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
