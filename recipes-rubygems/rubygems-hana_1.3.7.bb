# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hana"
DESCRIPTION = "Implementation of [JSON Patch][1] and [JSON Pointer][2] RFC."
HOMEPAGE = "http://github.com/tenderlove/hana"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c3776ca474702c6bdc9a5d1778b9840e"
SRC_URI[sha256sum] = "5425db42d651fea08859811c29d20446f16af196308162894db208cac5ce9b0d"

GEM_NAME = "hana"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
