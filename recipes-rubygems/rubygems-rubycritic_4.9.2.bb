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

SRC_URI[md5sum] = "ae25c6e58a113efac3f62dd4abbed8fa"
SRC_URI[sha256sum] = "8b925670ef6e7e9480fd6f4aceb882177c9afd2b6a2bb2fb04fdd25c7e7857bb"

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
