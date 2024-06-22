# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: fast_gettext"
DESCRIPTION = "A simple, fast, memory-efficient and threadsafe implementation of GetText"
HOMEPAGE = "https://github.com/grosser/fast_gettext"

LICENSE = "MIT & Ruby"
LIC_FILES_CHKSUM = "file://LICENSE;md5=de73345c85d650bab85563ec6f1b2f9d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-prime-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "301b4b7f39bb621cce8f6edbd598ed52"
SRC_URI[sha256sum] = "fd26c4c406aa10be34f0fd2847ce3ffdc1e9d9798de87538594757bbb9175fbf"

GEM_NAME = "fast_gettext"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-prime \
"

BBCLASSEXTEND = "native"
