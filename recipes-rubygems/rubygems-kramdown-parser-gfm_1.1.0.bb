# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: kramdown-parser-gfm"
DESCRIPTION = "kramdown-parser-gfm provides a kramdown parser for the GFM dialect of Markdown"
HOMEPAGE = "https://github.com/kramdown/parser-gfm"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=22e426aa1c3c4ebfeb7201e70fcefa60"

DEPENDS:class-native += "\
    rubygems-kramdown-native \
"

SRC_URI[md5sum] = "1bc966d087bbb0eeb99fb877773173f5"
SRC_URI[sha256sum] = "fb39745516427d2988543bf01fc4cf0ab1149476382393e0e9c48592f6581729"

GEM_NAME = "kramdown-parser-gfm"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-kramdown \
"

BBCLASSEXTEND = "native"
