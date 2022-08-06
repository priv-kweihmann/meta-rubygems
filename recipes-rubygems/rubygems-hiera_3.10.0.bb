# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hiera"
DESCRIPTION = "A pluggable data store for hierarcical data"
HOMEPAGE = "https://github.com/puppetlabs/hiera"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=67c01e92d4ae704f266de057db62d718"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "96d4268e1bf8d0716af902f1a01f742a"
SRC_URI[sha256sum] = "00f49eb56da623ebd99f7b388ae33590d4e093e479703d5fe139fb3f64decb72"

GEM_NAME = "hiera"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
