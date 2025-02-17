# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-winrm-fs"
DESCRIPTION = "Ruby library for file system operations via Windows Remote Management"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d273d63619c9aeaf15cdaf76422c4f87"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-chef-winrm-native \
    rubygems-erubi-native \
    rubygems-logging-native \
    rubygems-rubyzip-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "aa71f1d82c7f2bdbae0750d86cf9f1f1"
SRC_URI[sha256sum] = "d48e56bc8a559afaae39235b09df3817f03b662417396091d13d958030d89a14"

GEM_NAME = "chef-winrm-fs"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_install:append() {
    mv ${D}${bindir}/rwinrmcp ${D}${bindir}/chef-rwinrmcp 
}

RDEPENDS:${PN}:class-target += "\
    rubygems-chef-winrm \
    rubygems-erubi \
    rubygems-logging \
    rubygems-rubyzip \
"

BBCLASSEXTEND = "native"
