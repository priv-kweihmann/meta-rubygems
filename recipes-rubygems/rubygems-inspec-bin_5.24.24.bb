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

SRC_URI[md5sum] = "7126ba48751700a81b1e4c6a07dd4617"
SRC_URI[sha256sum] = "b818d081b8175f6b633f4cb8be8f115fed68130443fd91759bda8123ffe502c6"

GEM_NAME = "inspec-bin"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-inspec \
"

BBCLASSEXTEND = "native"
