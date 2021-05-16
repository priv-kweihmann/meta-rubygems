# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: colorator"
DESCRIPTION = "Colorize your text in the terminal."
HOMEPAGE = "https://github.com/octopress/colorator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7142c47e8abbc7d3d61d8755d76dc42e"

SRC_URI[md5sum] = "1c8e8ee6c0cf7ef7d531343056f94ad5"
SRC_URI[sha256sum] = "e2f85daf57af47d740db2a32191d1bdfb0f6503a0dfbc8327d0c9154d5ddfc38"

GEM_NAME = "colorator"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
