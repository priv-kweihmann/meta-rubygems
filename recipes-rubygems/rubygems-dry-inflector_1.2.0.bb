# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-inflector"
DESCRIPTION = "String inflections for dry-rb"
HOMEPAGE = "https://dry-rb.org/gems/dry-inflector"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b14b1929847ba471f3f59da600744315"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "90f2342df79e52660f4fa966db9b0e0d"
SRC_URI[sha256sum] = "22f5d0b50fd57074ae57e2ca17e3b300e57564c218269dcf82ff3e42d3f38f2e"

GEM_NAME = "dry-inflector"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
