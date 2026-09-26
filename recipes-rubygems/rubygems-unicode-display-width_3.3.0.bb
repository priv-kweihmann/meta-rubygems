# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: unicode-display_width"
DESCRIPTION = "[Unicode 18.0.0] Determines the monospace display width of a string using EastAsianWidth.txt, Unicode general category, Emoji specification, and other data."
HOMEPAGE = "https://github.com/janlelis/unicode-display_width"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=b13fbba25cc441d2e9d2bd24a28449f0"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-unicode-emoji-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5c57307da508f2be2a26cc5e21377647"
SRC_URI[sha256sum] = "4b7aa66a4b11db50f6f7e98411215cd0dd10eaecb665d36eec5bcacb3fa0b613"

GEM_NAME = "unicode-display_width"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-unicode-emoji \
"

BBCLASSEXTEND = "native"
