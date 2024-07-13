# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: sexp_processor"
DESCRIPTION = "sexp_processor branches from ParseTree bringing all the generic sexpprocessing tools with it"
HOMEPAGE = "https://github.com/seattlerb/sexp_processor"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=70;endline=93;md5=5db85eba7780ac1765a03fe0e5ec1657"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "eeaeaecdda126034566d3ca762b44dd9"
SRC_URI[sha256sum] = "0dfdd3d90aed28360cb3032ac8905bca66d8c5f5cab01e94762206eca24e75be"

GEM_NAME = "sexp_processor"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
