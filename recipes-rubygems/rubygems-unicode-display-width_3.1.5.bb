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

SRC_URI[md5sum] = "c99951f537ebb426c96c24ea3b4cdea8"
SRC_URI[sha256sum] = "bf566817855ee7ee3adcf7bace0d5906cb14401417db59193f8a5fcedf02dd4e"

GEM_NAME = "unicode-display_width"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-unicode-emoji \
"

BBCLASSEXTEND = "native"
