# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ruby_parser"
DESCRIPTION = "ruby_parser (RP) is a ruby parser written in pure ruby (utilizingracc--which does by default use a C extension)"
HOMEPAGE = "https://github.com/seattlerb/ruby_parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=90;endline=113;md5=5db85eba7780ac1765a03fe0e5ec1657"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-sexp-processor-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c802f555b89a68d59901b030e5d752c6"
SRC_URI[sha256sum] = "17d0c8bbef7fcdf99b1070bb2555d49111758f75d312e8799f66df831ebdcbe3"

GEM_NAME = "ruby_parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-sexp-processor \
"

BBCLASSEXTEND = "native"
