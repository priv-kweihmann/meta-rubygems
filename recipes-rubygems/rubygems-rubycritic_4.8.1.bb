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
    rubygems-ruby-parser-native \
    rubygems-simplecov-native \
    rubygems-tty-which-native \
    rubygems-virtus-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "b515378c0ade4e55e86b7ef6bc78a167"
SRC_URI[sha256sum] = "9ce6231ccd819d579587cac95941d60776a7e0ec6b913cc319826733426fb56b"

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
    rubygems-ruby-parser \
    rubygems-simplecov \
    rubygems-tty-which \
    rubygems-virtus \
"

BBCLASSEXTEND = "native"
