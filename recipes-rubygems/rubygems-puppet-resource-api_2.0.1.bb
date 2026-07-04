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

SRC_URI[md5sum] = "6dea064c043756bc806d76bf30091c11"
SRC_URI[sha256sum] = "6c3c64450a5de34314867cfbb505a5837729a2639fa88885cde634cb76750a33"

GEM_NAME = "puppet-resource_api"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-hocon \
"

BBCLASSEXTEND = "native"
