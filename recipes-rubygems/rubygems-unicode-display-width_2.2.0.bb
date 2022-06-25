# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: unicode-display_width"
DESCRIPTION = "[Unicode 14.0.0] Determines the monospace display width of a string using EastAsianWidth.txt, Unicode general category, and other data."
HOMEPAGE = "https://github.com/janlelis/unicode-display_width"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=38f885a87e32eed13bc10f42b4ab39cf"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "970f312f0401b84b9ad16437892b3feb"
SRC_URI[sha256sum] = "967fa4071b42b2c4afab8375c4f464392c5fb956959c0ceeb3cea0f4cd648eda"

GEM_NAME = "unicode-display_width"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
