# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rouge"
DESCRIPTION = "Rouge aims to a be a simple, easy-to-extend drop-in replacement for pygments."
HOMEPAGE = "http://rouge.jneen.net/"

LICENSE = "MIT AND BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6b48c48828e3f0a22274ed1d5e0b1c58"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-strscan-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "afb4f22854e36393126047e18574a21b"
SRC_URI[sha256sum] = "b77c632842ab7f5147940212f0345808cccfbce864fd5b631d7d12a35ac85452"

GEM_NAME = "rouge"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-strscan \
"

BBCLASSEXTEND = "native"
