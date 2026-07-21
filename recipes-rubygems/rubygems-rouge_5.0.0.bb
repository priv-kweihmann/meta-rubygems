# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rouge"
DESCRIPTION = "Rouge aims to a be a simple, easy-to-extend drop-in replacement for pygments."
HOMEPAGE = "http://rouge.jneen.net/"

LICENSE = "BSD-2-Clause AND MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6b48c48828e3f0a22274ed1d5e0b1c58"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-strscan-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "8b8d6111af591731f3a940200dce9194"
SRC_URI[sha256sum] = "e2de9bba2f9cb88f8a73bca3643b560b2b398f32f91bf716f584477bc0175ebc"

GEM_NAME = "rouge"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-strscan \
"

BBCLASSEXTEND = "native"
