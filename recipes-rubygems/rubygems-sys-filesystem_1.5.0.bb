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

SRC_URI[md5sum] = "450267f54855cf99141291106d374dd3"
SRC_URI[sha256sum] = "fb4dac05ec59f79c3f5f09f0465749f02059c8f67fa8e6d0aad4e12a064b2ba9"

GEM_NAME = "sys-filesystem"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
