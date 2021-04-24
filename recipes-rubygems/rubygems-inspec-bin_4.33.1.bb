# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS_class-native += "\
    rubygems-inspec-native \
"

SRC_URI[md5sum] = "cb76c47d5b7fe88cc12adc3ad1e6dd79"
SRC_URI[sha256sum] = "02e492ff7bd334b05c37343e9f2c606e25675e6bb4314fdf4516b948834bb1a9"

GEM_NAME = "inspec-bin"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-inspec \
"

BBCLASSEXTEND = "native"
