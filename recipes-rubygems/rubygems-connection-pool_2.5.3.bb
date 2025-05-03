# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: connection_pool"
DESCRIPTION = "Generic connection pool for Ruby"
HOMEPAGE = "https://github.com/mperham/connection_pool"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=52789255e9a79d4ae4a5ab6831d80fd1"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "bb081ba10f21f63d0e49ea8b6528c009"
SRC_URI[sha256sum] = "cfd74a82b9b094d1ce30c4f1a346da23ee19dc8a062a16a85f58eab1ced4305b"

GEM_NAME = "connection_pool"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
