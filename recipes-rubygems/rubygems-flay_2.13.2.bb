# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: flay"
DESCRIPTION = "Flay analyzes code for structural similarities"
HOMEPAGE = "http://ruby.sadi.st/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=100;endline=123;md5=9729e7cc2f0b6cd88813876ac0335063"

EXTRA_DEPENDS:append = " \
    rubygems-gauntlet \
"
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-erubi-native \
    rubygems-path-expander-native \
    rubygems-ruby-parser-native \
    rubygems-sexp-processor-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "dbfc718b78b77538311bbfa3f4ff45f5"
SRC_URI[sha256sum] = "55d23255ac83ce64f45e86765667c3e0b868dc06a6b08238113201757d1574e2"

GEM_NAME = "flay"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-erubi \
    rubygems-path-expander \
    rubygems-ruby-parser \
    rubygems-sexp-processor \
"

BBCLASSEXTEND = "native"
