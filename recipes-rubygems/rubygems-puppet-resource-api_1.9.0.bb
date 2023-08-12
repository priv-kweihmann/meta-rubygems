# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: puppet-resource_api"
DESCRIPTION = "This library provides a simple way to write new native resources for puppet."
HOMEPAGE = "https://github.com/puppetlabs/puppet-resource_api"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-hocon-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "34a4d89f3241421aae2eb95e0af73cee"
SRC_URI[sha256sum] = "4b82e77fad1d3810f3a84ad727aa9fd7c4e8b1179bacc034e9071c0a8f2ebe67"

GEM_NAME = "puppet-resource_api"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-hocon \
"

BBCLASSEXTEND = "native"
