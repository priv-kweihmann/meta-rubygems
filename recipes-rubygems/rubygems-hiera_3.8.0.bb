# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hiera"
DESCRIPTION = "A pluggable data store for hierarcical data"
HOMEPAGE = "https://github.com/puppetlabs/hiera"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=67c01e92d4ae704f266de057db62d718"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "a3f2e2fb2c31fdcdd18b2f881988a19e"
SRC_URI[sha256sum] = "321b3ff8a9556b8df0e4f82ce169fbd8cb59a4a691d0bf807a63e9d1d47efd0c"

GEM_NAME = "hiera"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
