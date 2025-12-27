# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: flay"
DESCRIPTION = "Flay analyzes code for structural similarities"
HOMEPAGE = "http://ruby.sadi.st/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
    file://README.rdoc;beginline=100;endline=123;md5=9729e7cc2f0b6cd88813876ac0335063 \
"

EXTRA_DEPENDS:append = " \
    rubygems-gauntlet \
"
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-erubi-native \
    rubygems-path-expander-native \
    rubygems-prism-native \
    rubygems-sexp-processor-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "dd8818b860b4d7b4f59052882a0d6011"
SRC_URI[sha256sum] = "58c07d17463b5eaa2be0562cf33ede6a60e83896ec3a4915412d9cbb34bdf2e9"

GEM_NAME = "flay"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-erubi \
    rubygems-path-expander \
    rubygems-prism \
    rubygems-sexp-processor \
"

BBCLASSEXTEND = "native"
