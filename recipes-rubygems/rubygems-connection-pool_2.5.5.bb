# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: connection_pool"
DESCRIPTION = "Generic connection pool for Ruby"
HOMEPAGE = "https://github.com/mperham/connection_pool"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=52789255e9a79d4ae4a5ab6831d80fd1"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "924aff7b39dd39b33fc2df44b1e84942"
SRC_URI[sha256sum] = "e54ff92855753df1fd7c59fa04a398833355f27dd14c074f8c83a05f72a716ad"

GEM_NAME = "connection_pool"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
