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

SRC_URI[md5sum] = "033f991d420c7a030c3c2e702b4bcc49"
SRC_URI[sha256sum] = "ff605cdb7027cdb80fdb7f8295bc2e2d6c3e46040b9c44ccd24419c7348a1430"

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
