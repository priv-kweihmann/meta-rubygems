# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: regexp_parser"
DESCRIPTION = "A library for tokenizing, lexing, and parsing Ruby regular expressions."
HOMEPAGE = "https://github.com/ammar/regexp_parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acbe5fd8c117016e05bf2ef780ec3460"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c49b8ab400392e02a2c2ee880390a09e"
SRC_URI[sha256sum] = "ca13f381a173b7a93450e53459075c9b76a10433caadcb2f1180f2c741fc55a4"

GEM_NAME = "regexp_parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
