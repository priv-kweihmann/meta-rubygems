# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: regexp_parser"
DESCRIPTION = "A library for tokenizing, lexing, and parsing Ruby regular expressions."
HOMEPAGE = "https://github.com/ammar/regexp_parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f81d70505c10ba253e0624c230474ad6"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9e98006545dbe5b4c41e2714d5cb13cd"
SRC_URI[sha256sum] = "027ee5a6ce139c34ec0fad5c397e2cf5b745e31f93e119fc3a59ed5f78124f7e"

GEM_NAME = "regexp_parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
