# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubycritic"
DESCRIPTION = "RubyCritic is a tool that wraps around various static analysis gems to provide a quality report of your Ruby code."
HOMEPAGE = "https://github.com/whitesmith/rubycritic"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ebcb01890999ed287441ae4afce9a346"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-flay-native \
    rubygems-flog-native \
    rubygems-launchy-native \
    rubygems-parser-native \
    rubygems-rainbow-native \
    rubygems-reek-native \
    rubygems-rexml-native \
    rubygems-ruby-parser-native \
    rubygems-simplecov-native \
    rubygems-tty-which-native \
    rubygems-virtus-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7b6e1f2e04d0b95fdca778008456f969"
SRC_URI[sha256sum] = "1db130571cac57f5bc37dc236d9f5d68a0eaecdbfe18a4e1a0f00fd751b4a0cc"

GEM_NAME = "rubycritic"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-flay \
    rubygems-flog \
    rubygems-launchy \
    rubygems-parser \
    rubygems-rainbow \
    rubygems-reek \
    rubygems-rexml \
    rubygems-ruby-parser \
    rubygems-simplecov \
    rubygems-tty-which \
    rubygems-virtus \
"

BBCLASSEXTEND = "native"
