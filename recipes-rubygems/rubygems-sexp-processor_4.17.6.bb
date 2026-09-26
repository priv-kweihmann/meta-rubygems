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

SRC_URI[md5sum] = "f0fce068916efaccd8c18e5813961b70"
SRC_URI[sha256sum] = "3c5d0e9db06377abde06db51dbacb14ce239ed0bd038ae515bc42c81602c6c1f"

GEM_NAME = "sexp_processor"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
