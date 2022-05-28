# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: logging"
DESCRIPTION = "**Logging** is a flexible logging library for use in Ruby programs based on thedesign of Java's log4j library"
HOMEPAGE = "http://rubygems.org/gems/logging"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6b49bc59d892746c7eda6db23862f61"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-little-plugger-native \
    rubygems-multi-json-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "864dbb25dcaa5fe55c39df3e599149a1"
SRC_URI[sha256sum] = "02347901efa6bc96d319bd5a83ad194395b900299a35f940080c3dd22f64d4fd"

GEM_NAME = "logging"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-little-plugger \
    rubygems-multi-json \
"

BBCLASSEXTEND = "native"
