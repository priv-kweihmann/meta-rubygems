# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS:class-native += "\
    rubygems-inspec-native \
"

SRC_URI[md5sum] = "2b63febc743e280b36f0d7bf585219bf"
SRC_URI[sha256sum] = "06ac64feb82c8adec4757e46acf2873d8aece46bcd9741974633edbaad5ca6c1"

GEM_NAME = "inspec-bin"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-inspec \
"

BBCLASSEXTEND = "native"
