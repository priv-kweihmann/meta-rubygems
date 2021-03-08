# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: facter"
DESCRIPTION = "New version of Facter"
HOMEPAGE = "None"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://lib/facter/custom_facts/core/legacy_facter.rb;beginline=7;endline=17;md5=c8fc292a3d6f5f2a01e376d7df456c89"

DEPENDS_class-native += "\
    rubygems-hocon-native \
    rubygems-thor-native \
"

SRC_URI[md5sum] = "d8088a901f508ffd8652508500a94924"
SRC_URI[sha256sum] = "89b782fddd6ae98e400858a50e9f5f2adf6ad8607eb06a7b1ee4759b70ca6b82"

GEM_NAME = "facter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-hocon \
    rubygems-thor \
"

BBCLASSEXTEND = "native"
