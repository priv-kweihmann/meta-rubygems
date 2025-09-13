# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: sys-filesystem"
DESCRIPTION = "The sys-filesystem library provides a cross-platform interface for    gathering filesystem information, such as disk space and mount point data."
HOMEPAGE = "https://github.com/djberg96/sys-filesystem"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-ffi-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "89f97da39a074a019868b956e95d796c"
SRC_URI[sha256sum] = "a6101674a4d0e641b0f628753439091134e080ed84a3e794570aa2fb07872b45"

GEM_NAME = "sys-filesystem"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
