# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: regexp_parser"
DESCRIPTION = "A library for tokenizing, lexing, and parsing Ruby regular expressions."
HOMEPAGE = "https://github.com/ammar/regexp_parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f81d70505c10ba253e0624c230474ad6"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "8ecfc1a4a256e892228b2cfa580a98c9"
SRC_URI[sha256sum] = "f163ba463a45ca2f2730e0902f2475bb0eefcd536dfc2f900a86d1e5a7d7a556"

GEM_NAME = "regexp_parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
