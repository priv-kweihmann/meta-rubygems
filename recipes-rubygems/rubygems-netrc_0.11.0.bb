# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: netrc"
DESCRIPTION = "This library can read and update netrc files, preserving formatting including comments and whitespace."
HOMEPAGE = "https://github.com/geemus/netrc"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=fbc1780cb015057c6475ce5cfb4b2a4f"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "eea1360cd1f601b6688722541f544d3e"
SRC_URI[sha256sum] = "de1ce33da8c99ab1d97871726cba75151113f117146becbe45aa85cb3dabee3f"

GEM_NAME = "netrc"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
