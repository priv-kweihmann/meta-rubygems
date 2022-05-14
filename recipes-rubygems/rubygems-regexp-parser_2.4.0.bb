# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: regexp_parser"
DESCRIPTION = "A library for tokenizing, lexing, and parsing Ruby regular expressions."
HOMEPAGE = "https://github.com/ammar/regexp_parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f81d70505c10ba253e0624c230474ad6"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "cfcf01bd6a0e4e69d801c20a167048a3"
SRC_URI[sha256sum] = "66656671d430243154e42098dd93a7e3ee453c32b655a2c694ca4b9f0f6b3507"

GEM_NAME = "regexp_parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
