# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec-bin"
DESCRIPTION = "InSpec executable for inspec gem"
HOMEPAGE = "https://github.com/inspec/inspec/tree/master/inspec-bin"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=81b0e16be045534c5330969d1e542bb4"

DEPENDS_class-native += "\
    rubygems-inspec-native \
"

SRC_URI[md5sum] = "8d44e9a1cda2e8b88bd7c77cba358322"
SRC_URI[sha256sum] = "206a2490877901b3b9f111fb30847efd380765191b9df06ef46b31af55bf3181"

GEM_NAME = "inspec-bin"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-inspec \
"

BBCLASSEXTEND = "native"
