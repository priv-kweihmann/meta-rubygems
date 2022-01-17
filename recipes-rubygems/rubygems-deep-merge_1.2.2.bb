# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: deep_merge"
DESCRIPTION = "Recursively merge hashes."
HOMEPAGE = "https://github.com/danielsdeleo/deep_merge"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40522ec22c562bf3cca73d5973a66077"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "57447247ff4e736cb5ff9b60206f0b5e"
SRC_URI[sha256sum] = "83ced3a3d7f95f67de958d2ce41b1874e83c8d94fe2ddbff50c8b4b82323563a"

GEM_NAME = "deep_merge"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
