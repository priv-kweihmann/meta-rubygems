# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: tty-screen"
DESCRIPTION = "Terminal screen size detection that works on Linux, macOS and Windows systems and supports Ruby MRI, JRuby, TruffleRuby and Rubinius interpreters."
HOMEPAGE = "https://ttytoolkit.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=44c90f850dd3c54ddfcbffb1d5b0f3a7"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7752ca6968eaa736b34bb2a772181547"
SRC_URI[sha256sum] = "c090652115beae764336c28802d633f204fb84da93c6a968aa5d8e319e819b50"

GEM_NAME = "tty-screen"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
