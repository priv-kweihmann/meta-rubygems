# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: method_source"
DESCRIPTION = "retrieve the sourcecode for a method"
HOMEPAGE = "http://banisterfiend.wordpress.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c63cba9aa4fa8e06779220481f7dc4f"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "a8553bc1e3941e781683779da71d3896"
SRC_URI[sha256sum] = "181301c9c45b731b4769bc81e8860e72f9161ad7d66dd99103c9ab84f560f5c5"

GEM_NAME = "method_source"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
