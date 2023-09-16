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

SRC_URI[md5sum] = "9687f5aa753e8b905c4f718af71d5995"
SRC_URI[sha256sum] = "f5d3a19adf8249a8803a057534034cef6afa3f149fe1d07251cf76ee2c1ac59b"

GEM_NAME = "sys-filesystem"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
