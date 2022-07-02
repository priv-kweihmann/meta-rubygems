# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubocop"
DESCRIPTION = "RuboCop is a Ruby code style checking and code formatting tool.    It aims to enforce the community-driven Ruby Style Guide."
HOMEPAGE = "https://rubocop.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=fc850d6ee0639e80c9a97e78a2daad32"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-json-native \
    rubygems-parallel-native \
    rubygems-parser-native \
    rubygems-rainbow-native \
    rubygems-regexp-parser-native \
    rubygems-rexml-native \
    rubygems-rubocop-ast-native \
    rubygems-ruby-progressbar-native \
    rubygems-unicode-display-width-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "fe14c1057b5755934b4aff6be9e05021"
SRC_URI[sha256sum] = "bc8cbc2ca284d31785e3379bad610447e4cb43688a6db38c0c4f50c0c3afca19"

GEM_NAME = "rubocop"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-json \
    rubygems-parallel \
    rubygems-parser \
    rubygems-rainbow \
    rubygems-regexp-parser \
    rubygems-rexml \
    rubygems-rubocop-ast \
    rubygems-ruby-progressbar \
    rubygems-unicode-display-width \
"

BBCLASSEXTEND = "native"
