# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: winrm-elevated"
DESCRIPTION = "Ruby library for running commands via WinRM as elevated through a scheduled task"
HOMEPAGE = "https://github.com/WinRb/winrm-elevated"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-winrm-fs-native \
    rubygems-winrm-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0bef05369eabf179799f3b39f479b094"
SRC_URI[sha256sum] = "8dc4f4fe3064f4a366825684e9e4bd8b5c89db0029b7acdb8611f0c792d7171c"

GEM_NAME = "winrm-elevated"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-winrm \
    rubygems-winrm-fs \
"

BBCLASSEXTEND = "native"
