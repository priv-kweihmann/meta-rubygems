# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: regexp_parser"
DESCRIPTION = "A library for tokenizing, lexing, and parsing Ruby regular expressions."
HOMEPAGE = "https://github.com/ammar/regexp_parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acbe5fd8c117016e05bf2ef780ec3460"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1c5499f58fa07f6164633ba9859b7cd1"
SRC_URI[sha256sum] = "5a5665b92d22e38c54481fda01050da7c5058ddbd5037ad91b6c9fc7432739ee"

GEM_NAME = "regexp_parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
