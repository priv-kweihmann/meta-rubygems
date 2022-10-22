# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: jekyll"
DESCRIPTION = "Jekyll is a simple, blog aware, static site generator."
HOMEPAGE = "https://jekyllrb.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf9972594da0ef277f46d8d9e5902582"

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
    rubygems-webrick-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "4bf950eb1f8901a1069869843d463b3d"
SRC_URI[sha256sum] = "d79338de958877bc9bb2c7970f81497dfc500ce72641ef4682b311a61fef053d"

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
