# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: semverse"
DESCRIPTION = "An elegant library for representing and comparing SemVer versions and constraints"
HOMEPAGE = "https://github.com/chef/semverse/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0ea6ed752656ac5be37c1a1a18c684f1"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "4aa3ea66cc468bcdb2e217e3c959210c"
SRC_URI[sha256sum] = "c9726aee7858d37c84948a4101daffdcf03a0963a12a33ad7cc39a72c03530ef"

GEM_NAME = "semverse"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
