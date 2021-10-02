# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jekyll"
DESCRIPTION = "Jekyll is a simple, blog aware, static site generator."
HOMEPAGE = "https://jekyllrb.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92baaac04ede32a58b267256e1307b2b"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-addressable-native \
    rubygems-colorator-native \
    rubygems-em-websocket-native \
    rubygems-i18n-native \
    rubygems-jekyll-sass-converter-native \
    rubygems-jekyll-watch-native \
    rubygems-kramdown-native \
    rubygems-kramdown-parser-gfm-native \
    rubygems-liquid-native \
    rubygems-mercenary-native \
    rubygems-pathutil-native \
    rubygems-rouge-native \
    rubygems-safe-yaml-native \
    rubygems-terminal-table-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7d84fea64e7f7ba8b127b3f6cf52319d"
SRC_URI[sha256sum] = "4fb1439ce770dc7d73af083bf14cff352b076ab763ba20e4bac8e9b94b0243fb"

GEM_NAME = "jekyll"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-colorator \
    rubygems-em-websocket \
    rubygems-i18n \
    rubygems-jekyll-sass-converter \
    rubygems-jekyll-watch \
    rubygems-kramdown \
    rubygems-kramdown-parser-gfm \
    rubygems-liquid \
    rubygems-mercenary \
    rubygems-pathutil \
    rubygems-rouge \
    rubygems-safe-yaml \
    rubygems-terminal-table \
"

BBCLASSEXTEND = "native"
