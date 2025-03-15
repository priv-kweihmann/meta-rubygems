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

SRC_URI[md5sum] = "86cecf818483c680b8ced89ae47be925"
SRC_URI[sha256sum] = "4649fcb5d5e5f8cbda0887f706b95be5b52a089bcf98ce8ebf0496c3266fd9c4"

GEM_NAME = "puppet-resource_api"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-hocon \
"

BBCLASSEXTEND = "native"
