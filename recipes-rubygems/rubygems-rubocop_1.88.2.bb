# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubocop"
DESCRIPTION = "RuboCop is a Ruby code style checking and code formatting tool.It aims to enforce the community-driven Ruby Style Guide."
HOMEPAGE = "https://rubocop.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e214f101c385efe3571135a6b1b06938"

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

SRC_URI[md5sum] = "089367e1fc34062a193cfdc023071a0f"
SRC_URI[sha256sum] = "8def251c90cd955feb4daa3edc0ab56893250c4ce90ef81e6c80c03f9a939bbf"

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
