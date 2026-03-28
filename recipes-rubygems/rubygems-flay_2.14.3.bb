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

SRC_URI[md5sum] = "838d05907a5c8a1f1e2a4d2a9701021a"
SRC_URI[sha256sum] = "7f96a495f4bde880460e77e7345464e752bd44f09f5cd30c80af02afe0ed3f29"

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
