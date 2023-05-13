# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: thor"
DESCRIPTION = "Thor is a toolkit for building powerful command-line interfaces."
HOMEPAGE = "http://whatisthor.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=690cce21f4e069148a52834e1ecf352e"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "cafae723e9fc9ab9bc834471cee2a906"
SRC_URI[sha256sum] = "2f93c652828cba9fcf4f65f5dc8c306f1a7317e05aad5835a13740122c17f24c"

GEM_NAME = "thor"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
