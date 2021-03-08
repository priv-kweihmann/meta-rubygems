# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: puppet-resource_api"
DESCRIPTION = "This library provides a simple way to write new native resources for puppet."
HOMEPAGE = "https://github.com/puppetlabs/puppet-resource_api"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

DEPENDS_class-native += "\
    rubygems-hocon-native \
"

SRC_URI[md5sum] = "3f6edad4f7a03713ff20d8ae0378e895"
SRC_URI[sha256sum] = "db296a0046dac6bd14f56b39f1ac22c6503ba1c80ca2468f6c058cebd5c1a33d"

GEM_NAME = "puppet-resource_api"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-hocon \
"

BBCLASSEXTEND = "native"
