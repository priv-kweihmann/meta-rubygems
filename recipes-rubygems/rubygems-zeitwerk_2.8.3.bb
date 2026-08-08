# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: zeitwerk"
DESCRIPTION = "Zeitwerk implements constant autoloading with Ruby semantics"
HOMEPAGE = "https://github.com/fxn/zeitwerk"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=5812b5ac986b987e30b9a65d087d8cd7"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d9cf0a172db9d95913b089f491a650e2"
SRC_URI[sha256sum] = "2c85125a8467ce069e20123d1e709a08955c9d29c118c25b46b7b7fafdbb92e5"

GEM_NAME = "zeitwerk"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
