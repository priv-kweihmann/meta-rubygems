# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: zeitwerk"
DESCRIPTION = "Zeitwerk implements constant autoloading with Ruby semantics"
HOMEPAGE = "https://github.com/fxn/zeitwerk"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=5812b5ac986b987e30b9a65d087d8cd7"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f351f7e56918311c04e8ff8516e527a4"
SRC_URI[sha256sum] = "b2e68622ba95680a357430c89e1777d6e6796d63c7c02e8790cc38f4c33822cf"

GEM_NAME = "zeitwerk"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
