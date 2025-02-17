# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-winrm-elevated"
DESCRIPTION = "Ruby library for running commands via WinRM as elevated through a scheduled task"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d273d63619c9aeaf15cdaf76422c4f87"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-chef-winrm-fs-native \
    rubygems-chef-winrm-native \
    rubygems-erubi-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "25d4e2b9094a86434e593109bfccfe7e"
SRC_URI[sha256sum] = "9985b4eb1e5bbfbe1db9e4bbea29a5775ee9e6e7d52cfbb9787bcab605ff5807"

GEM_NAME = "chef-winrm-elevated"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-chef-winrm \
    rubygems-chef-winrm-fs \
    rubygems-erubi \
"

BBCLASSEXTEND = "native"
