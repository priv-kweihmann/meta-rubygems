# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: wmi-lite"
DESCRIPTION = "A lightweight utility over win32ole for accessing basic WMI (Windows Management Instrumentation) functionality in the Microsoft Windows operating system"
HOMEPAGE = "https://github.com/chef/wmi-lite"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "92f028d883c786a63fbee8404619fa6b"
SRC_URI[sha256sum] = "116ef5bb470dbe60f58c2db9047af3064c16245d6562c646bc0d90877e27ddda"

GEM_NAME = "wmi-lite"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
