# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: fast_gettext"
DESCRIPTION = "A simple, fast, memory-efficient and threadsafe implementation of GetText"
HOMEPAGE = "https://github.com/grosser/fast_gettext"

LICENSE = "MIT & Ruby"
LIC_FILES_CHKSUM = "file://LICENSE;md5=de73345c85d650bab85563ec6f1b2f9d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b8cd6edebb266f28a771380236612c96"
SRC_URI[sha256sum] = "01804331afce7b7c918e7ebe1951a3507b24b3a0c0617429725dbd4a2f234ad8"

GEM_NAME = "fast_gettext"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
