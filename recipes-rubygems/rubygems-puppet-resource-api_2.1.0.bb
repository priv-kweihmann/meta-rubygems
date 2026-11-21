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

SRC_URI[md5sum] = "a52f3ec27e820e76ab605a3455ba9f80"
SRC_URI[sha256sum] = "54cab5d93d0811016c9a8842181697db998b30734d5f023e623cdc8d29b22a0d"

GEM_NAME = "puppet-resource_api"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-hocon \
"

BBCLASSEXTEND = "native"
