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

SRC_URI[md5sum] = "9ec4d4574e6ed5716f4df440280d1fb9"
SRC_URI[sha256sum] = "8caf2af1c0f2f07ec89ef9e18c7d88c2790e217c482bfc78aaa65eadd5415ac1"

GEM_NAME = "unicode-display_width"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-unicode-emoji \
"

BBCLASSEXTEND = "native"
