# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-winrm-fs"
DESCRIPTION = "Ruby library for file system operations via Windows Remote Management"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d273d63619c9aeaf15cdaf76422c4f87"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-benchmark-native \
    rubygems-chef-winrm-native \
    rubygems-csv-native \
    rubygems-erubi-native \
    rubygems-logging-native \
    rubygems-rubyzip-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1bb486cb5de18342aed0586879c0b048"
SRC_URI[sha256sum] = "5b80fd1298584dbc9ec43f5cadfcd9896d43c8f4289c1aa40a5c0ad7fbc119bd"

GEM_NAME = "chef-winrm-fs"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_install:append() {
    mv ${D}${bindir}/rwinrmcp ${D}${bindir}/chef-rwinrmcp 
}

RDEPENDS:${PN}:class-target += "\
    rubygems-benchmark \
    rubygems-chef-winrm \
    rubygems-csv \
    rubygems-erubi \
    rubygems-logging \
    rubygems-rubyzip \
"

BBCLASSEXTEND = "native"
