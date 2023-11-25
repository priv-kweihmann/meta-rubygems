# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/main/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-inspec-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d7df7cb6dfd09e5c16235bf6a08213e0"
SRC_URI[sha256sum] = "38bb1c819971e1fce41484f956654b9bb4d40f90545913cc1d3aa072962a0665"

GEM_NAME = "inspec-bin"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-inspec \
"

BBCLASSEXTEND = "native"
