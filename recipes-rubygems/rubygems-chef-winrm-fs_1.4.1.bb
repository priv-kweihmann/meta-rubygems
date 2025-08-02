# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: chef-winrm-fs"
DESCRIPTION = "Ruby library for file system operations via Windows Remote Management"
HOMEPAGE = "http://github.com/WinRb/winrm-fs"

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

SRC_URI[md5sum] = "e382579baf45716599a70a290a299fcf"
SRC_URI[sha256sum] = "6316cf87e7398dd0d936ab8f35bc2b7127aa568b1bbba96fce9e96ddaaa6e0c9"

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
