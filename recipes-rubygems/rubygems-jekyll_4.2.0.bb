# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jekyll"
DESCRIPTION = "Jekyll is a simple, blog aware, static site generator."
HOMEPAGE = "https://jekyllrb.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf9972594da0ef277f46d8d9e5902582"

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
    rubygems-webrick-native \
"

SRC_URI[md5sum] = "719a878cc0c771db7f39dbc361355020"
SRC_URI[sha256sum] = "d86ae4bfaa09337af7666d0e8ab1b8dba5ca3750d496eea5ca4c232ed1811333"

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
    rubygems-webrick \
"

BBCLASSEXTEND = "native"
