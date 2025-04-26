# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubocop"
DESCRIPTION = "RuboCop is a Ruby code style checking and code formatting tool.It aims to enforce the community-driven Ruby Style Guide."
HOMEPAGE = "https://rubocop.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1b9c3ed21db2408f1ee5ce0463794c0b"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-json-native \
    rubygems-language-server-protocol-native \
    rubygems-lint-roller-native \
    rubygems-parallel-native \
    rubygems-parser-native \
    rubygems-rainbow-native \
    rubygems-regexp-parser-native \
    rubygems-rubocop-ast-native \
    rubygems-ruby-progressbar-native \
    rubygems-unicode-display-width-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0f684a3b536a3ce78a5fc0bde3b0a6f6"
SRC_URI[sha256sum] = "1860a1b571fe4a15dff79d6683642ebf3ea4b3f7ae7903743ab0885b4686a1d5"

GEM_NAME = "rubocop"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-json \
    rubygems-language-server-protocol \
    rubygems-lint-roller \
    rubygems-parallel \
    rubygems-parser \
    rubygems-rainbow \
    rubygems-regexp-parser \
    rubygems-rubocop-ast \
    rubygems-ruby-progressbar \
    rubygems-unicode-display-width \
"

BBCLASSEXTEND = "native"
