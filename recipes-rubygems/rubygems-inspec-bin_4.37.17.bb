# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS_class-native += "\
    rubygems-inspec-native \
"

SRC_URI[md5sum] = "a9610c72a21d59e0d00acfb3a3a762c8"
SRC_URI[sha256sum] = "a037fc3b60371e12af985ce00d3503dcdfbcf019b743da81281bee04402d1f12"

GEM_NAME = "inspec-bin"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-inspec \
"

BBCLASSEXTEND = "native"
