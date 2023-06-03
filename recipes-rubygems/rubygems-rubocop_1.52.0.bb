# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubocop"
DESCRIPTION = "RuboCop is a Ruby code style checking and code formatting tool.    It aims to enforce the community-driven Ruby Style Guide."
HOMEPAGE = "https://rubocop.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0360c125872746a42da0c505b04a7546"

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

SRC_URI[md5sum] = "49493671a08c2bd4c0559883574fd481"
SRC_URI[sha256sum] = "a9860af191f6d51696de9ece6ca8c072643ee6c04af4310242b13e642b11ef91"

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
