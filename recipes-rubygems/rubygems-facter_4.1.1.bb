# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: facter"
DESCRIPTION = "New version of Facter"
HOMEPAGE = "https://github.com/puppetlabs/facter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://lib/facter/custom_facts/core/legacy_facter.rb;beginline=7;endline=17;md5=c8fc292a3d6f5f2a01e376d7df456c89"

DEPENDS:class-native += "\
    rubygems-hocon-native \
    rubygems-thor-native \
"

SRC_URI[md5sum] = "4efbab3bd854c2bff992b641f08f2712"
SRC_URI[sha256sum] = "a4d61a61783e2ed61053492b2a1c2547dc7faded05305888d13e07ec78a9db12"

GEM_NAME = "facter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-hocon \
    rubygems-thor \
"

BBCLASSEXTEND = "native"
