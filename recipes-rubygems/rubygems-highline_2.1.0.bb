# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: highline"
DESCRIPTION = "A high-level IO library that provides validation, type conversion, and more forcommand-line interfaces"
HOMEPAGE = "https://github.com/JEG2/highline"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "4209083bda845d47dcc05b7ab23f25fd"
SRC_URI[sha256sum] = "d63d7f472f8ffaa143725161ae6fb06895b5cb7527e0b4dac5ad1e4902c80cb9"

GEM_NAME = "highline"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
