# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: unicode-display_width"
DESCRIPTION = "[Unicode 16.0.0] Determines the monospace display width of a string using EastAsianWidth.txt, Unicode general category, and other data."
HOMEPAGE = "https://github.com/janlelis/unicode-display_width"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=2a1669460e82588643cfe320d1b742e8"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "77e719750e6acdd2dbbc9ee10b8b2cbe"
SRC_URI[sha256sum] = "12279874bba6d5e4d2728cef814b19197dbb10d7a7837a869bab65da943b7f5a"

GEM_NAME = "unicode-display_width"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
