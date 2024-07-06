# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: dry-inflector"
DESCRIPTION = "String inflections for dry-rb"
HOMEPAGE = "https://dry-rb.org/gems/dry-inflector"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b14b1929847ba471f3f59da600744315"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d07eef24ac64c073990b8d99b235ed5f"
SRC_URI[sha256sum] = "340fb9b1b69b4355a3071f1d8fd94d97fc69d48c438748da5c13debfe5c06792"

GEM_NAME = "dry-inflector"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
