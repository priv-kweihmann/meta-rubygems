# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: unicode-display_width"
DESCRIPTION = "[Unicode 16.0.0] Determines the monospace display width of a string using EastAsianWidth.txt, Unicode general category, Emoji specification, and other data."
HOMEPAGE = "https://github.com/janlelis/unicode-display_width"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=2a1669460e82588643cfe320d1b742e8"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-unicode-emoji-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c749e2f228bb5cd1c4b6beb19f0b93aa"
SRC_URI[sha256sum] = "dbbbb0fddc2941a5d3582d8f991aad6df1defb83741649a07d27cccc4c95c942"

GEM_NAME = "unicode-display_width"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-unicode-emoji \
"

BBCLASSEXTEND = "native"
