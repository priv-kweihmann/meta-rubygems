# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS_class-native += "\
    rubygems-inspec-native \
"

SRC_URI[md5sum] = "46be8bdf098f5deabb31216f51c8d3df"
SRC_URI[sha256sum] = "05cb2aa58f748a9039cca54cd48c09df35c01f70a184eb1f8bba7fe35266ec5f"

GEM_NAME = "inspec-bin"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-inspec \
"

BBCLASSEXTEND = "native"
