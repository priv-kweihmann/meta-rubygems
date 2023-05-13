# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: sexp_processor"
DESCRIPTION = "sexp_processor branches from ParseTree bringing all the generic sexpprocessing tools with it"
HOMEPAGE = "https://github.com/seattlerb/sexp_processor"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=70;endline=93;md5=5db85eba7780ac1765a03fe0e5ec1657"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "bf4a1b14ee60209ba59fdcfbfd843e0d"
SRC_URI[sha256sum] = "4daa4874ce1838cd801c65e66ed5d4f140024404a3de7482c36d4ef2604dff6f"

GEM_NAME = "sexp_processor"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
