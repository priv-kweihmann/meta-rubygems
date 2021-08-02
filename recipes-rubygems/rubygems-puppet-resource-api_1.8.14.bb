# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: puppet-resource_api"
DESCRIPTION = "This library provides a simple way to write new native resources for puppet."
HOMEPAGE = "https://github.com/puppetlabs/puppet-resource_api"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

DEPENDS:class-native += "\
    rubygems-hocon-native \
"

SRC_URI[md5sum] = "aee660a8398fc1c4dff2154eeb8b5975"
SRC_URI[sha256sum] = "920e4fe74983cdfd20ce6b38f302bafbad653956aaf89cd9058d839eb3b590b5"

GEM_NAME = "puppet-resource_api"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-hocon \
"

BBCLASSEXTEND = "native"
