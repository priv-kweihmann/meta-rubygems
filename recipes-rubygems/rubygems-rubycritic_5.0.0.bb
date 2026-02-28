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
    rubygems-ostruct-native \
    rubygems-parser-native \
    rubygems-prism-native \
    rubygems-rainbow-native \
    rubygems-reek-native \
    rubygems-rexml-native \
    rubygems-ruby-parser-native \
    rubygems-simplecov-native \
    rubygems-tty-which-native \
    rubygems-virtus-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "4100ed1ae2f18dab8efada1682de9209"
SRC_URI[sha256sum] = "7f3877556d7f52bf0980496b7c907a827a9592ba690b80a593403a60bd6cfb42"

GEM_NAME = "rubycritic"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-flay \
    rubygems-flog \
    rubygems-launchy \
    rubygems-ostruct \
    rubygems-parser \
    rubygems-prism \
    rubygems-rainbow \
    rubygems-reek \
    rubygems-rexml \
    rubygems-ruby-parser \
    rubygems-simplecov \
    rubygems-tty-which \
    rubygems-virtus \
"

BBCLASSEXTEND = "native"
