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

SRC_URI[md5sum] = "ced0e439157ab80fa29396be4d83f8c5"
SRC_URI[sha256sum] = "d153a8928a0b6f74d4aab7a97577b12440d02df928ffbafb6ebe4bb6730a53f8"

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
