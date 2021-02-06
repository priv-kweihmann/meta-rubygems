# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: systemu"
DESCRIPTION = "universal capture of stdout and stderr and handling of child process pid for windows, *nix, etc."
HOMEPAGE = "https://github.com/ahoward/systemu"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e5d49a6ec236382a5e71349bf097db9d"

SRC_URI[md5sum] = "4972263c3be77f2a429a9ce24982b91b"
SRC_URI[sha256sum] = "01f7d014b1453b28e5781e15c4d7d63fc9221c29b174b7aae5253207a75ab33e"

GEM_NAME = "systemu"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
