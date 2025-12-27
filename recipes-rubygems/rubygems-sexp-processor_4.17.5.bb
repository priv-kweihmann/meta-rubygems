# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: sexp_processor"
DESCRIPTION = "sexp_processor branches from ParseTree bringing all the generic sexpprocessing tools with it"
HOMEPAGE = "https://github.com/seattlerb/sexp_processor"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
    file://README.rdoc;beginline=70;endline=93;md5=5db85eba7780ac1765a03fe0e5ec1657 \
"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "357dd94f729524dacfa0b73bacd15f7a"
SRC_URI[sha256sum] = "ae2b48ba98353d5d465ce8759836b7a05f2e12c5879fcd14d7815b026de32f0e"

GEM_NAME = "sexp_processor"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
