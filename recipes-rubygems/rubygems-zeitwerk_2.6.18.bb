# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: zeitwerk"
DESCRIPTION = "Zeitwerk implements constant autoloading with Ruby semantics"
HOMEPAGE = "https://github.com/fxn/zeitwerk"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=5812b5ac986b987e30b9a65d087d8cd7"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "08612fba3ce1c11b01253bc14907b764"
SRC_URI[sha256sum] = "bd2d213996ff7b3b364cd342a585fbee9797dbc1c0c6d868dc4150cc75739781"

GEM_NAME = "zeitwerk"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
