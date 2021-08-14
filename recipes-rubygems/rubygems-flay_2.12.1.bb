# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: flay"
DESCRIPTION = "Flay analyzes code for structural similarities"
HOMEPAGE = "http://ruby.sadi.st/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=100;endline=123;md5=9729e7cc2f0b6cd88813876ac0335063"

EXTRA_RDEPENDS:append = " rubygems-gauntlet"

DEPENDS:class-native += "\
    rubygems-erubis-native \
    rubygems-path-expander-native \
    rubygems-ruby-parser-native \
    rubygems-sexp-processor-native \
"

SRC_URI[md5sum] = "b2c4d45c0654ac18a13288697c512a37"
SRC_URI[sha256sum] = "677ff6fc3727ee297a25357e908dc9cf1243eb7e61b8852d595873a4907ac4d7"

GEM_NAME = "flay"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-erubis \
    rubygems-path-expander \
    rubygems-ruby-parser \
    rubygems-sexp-processor \
"

BBCLASSEXTEND = "native"
