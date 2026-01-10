# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: thor"
DESCRIPTION = "Thor is a toolkit for building powerful command-line interfaces."
HOMEPAGE = "https://github.com/rails/thor"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=690cce21f4e069148a52834e1ecf352e"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b37a5e20adf8c0864d2d41c05d1a3bf8"
SRC_URI[sha256sum] = "e3a9e55fe857e44859ce104a84675ab6e8cd59c650a49106a05f55f136425e73"

GEM_NAME = "thor"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
