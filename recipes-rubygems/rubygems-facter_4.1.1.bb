# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: facter"
DESCRIPTION = "New version of Facter"
HOMEPAGE = "https://github.com/puppetlabs/facter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
"

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
