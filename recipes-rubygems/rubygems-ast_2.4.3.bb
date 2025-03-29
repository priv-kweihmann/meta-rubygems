# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ast"
DESCRIPTION = "A library for working with Abstract Syntax Trees."
HOMEPAGE = "https://whitequark.github.io/ast/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.MIT;md5=b46ff44655f29020fc7542adda3ad781"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3eb6867d9cd1f22a606acf2c12ab4cf2"
SRC_URI[sha256sum] = "954615157c1d6a382bc27d690d973195e79db7f55e9765ac7c481c60bdb4d383"

GEM_NAME = "ast"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
