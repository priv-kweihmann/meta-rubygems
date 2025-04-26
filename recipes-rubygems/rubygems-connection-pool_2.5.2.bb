# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: connection_pool"
DESCRIPTION = "Generic connection pool for Ruby"
HOMEPAGE = "https://github.com/mperham/connection_pool"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=52789255e9a79d4ae4a5ab6831d80fd1"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "00b6caf1d3be9fad40d65684eaf1d7b6"
SRC_URI[sha256sum] = "c121d090f8217911f960c7b628bf2bf1b1444f284fd854edc188821c4f602108"

GEM_NAME = "connection_pool"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
