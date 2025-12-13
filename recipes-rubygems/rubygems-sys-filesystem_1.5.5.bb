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

SRC_URI[md5sum] = "c0645dbdf182b91051c4f7dd8d95fc33"
SRC_URI[sha256sum] = "6f995890a734b9f0aa55df5e09d99adeb9fd1c288f2c4097269a1f8c95e15033"

GEM_NAME = "sys-filesystem"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
