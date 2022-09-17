# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: connection_pool"
DESCRIPTION = "Generic connection pool for Ruby"
HOMEPAGE = "https://github.com/mperham/connection_pool"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=52789255e9a79d4ae4a5ab6831d80fd1"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "bbbbc0e38de79db9f0cb2907c81204a4"
SRC_URI[sha256sum] = "677985be912f33c90f98f229aaa0c0ddb2ef8776f21929a36eeeb25251c944da"

GEM_NAME = "connection_pool"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
