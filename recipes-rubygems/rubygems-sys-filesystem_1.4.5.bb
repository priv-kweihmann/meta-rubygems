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

SRC_URI[md5sum] = "dd62a9e7a78d1cdedc418c40ccd99381"
SRC_URI[sha256sum] = "1b61da4ace0f71fc4304126acf005fb8cd03677081bb352343199fddc9eaa56d"

GEM_NAME = "sys-filesystem"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ffi \
"

BBCLASSEXTEND = "native"
