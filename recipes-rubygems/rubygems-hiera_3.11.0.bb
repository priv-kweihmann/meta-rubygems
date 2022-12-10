# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: hiera"
DESCRIPTION = "A pluggable data store for hierarcical data"
HOMEPAGE = "https://github.com/puppetlabs/hiera"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=67c01e92d4ae704f266de057db62d718"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9bf0f27fc0607c772a0382d9700b987d"
SRC_URI[sha256sum] = "0f44d02adca4dce96c49dab2353b981718cbdea58f68713041f17fde2d8c855f"

GEM_NAME = "hiera"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
