# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: winrm-fs"
DESCRIPTION = "Ruby library for file system operations via Windows Remote Management"
HOMEPAGE = "http://github.com/WinRb/winrm-fs"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-benchmark-native \
    rubygems-csv-native \
    rubygems-logger-native \
    rubygems-rubyzip-native \
    rubygems-winrm-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e642264e01d9c0a7cb701bb9315a4bd5"
SRC_URI[sha256sum] = "90317105577b8ab1b5c5cc90b414f5052a0a291d56000793e5e2fd31b009e05f"

GEM_NAME = "winrm-fs"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-benchmark \
    rubygems-csv \
    rubygems-logger \
    rubygems-rubyzip \
    rubygems-winrm \
"

BBCLASSEXTEND = "native"
