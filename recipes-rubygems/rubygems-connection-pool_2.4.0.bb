# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: connection_pool"
DESCRIPTION = "Generic connection pool for Ruby"
HOMEPAGE = "https://github.com/mperham/connection_pool"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=52789255e9a79d4ae4a5ab6831d80fd1"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b7dd02381c0f316a817ce2c4d91c868b"
SRC_URI[sha256sum] = "bf004ce3fd54f93a3af7b4584c4f612c3080527234168bf98051d4b9f1b3cd36"

GEM_NAME = "connection_pool"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
