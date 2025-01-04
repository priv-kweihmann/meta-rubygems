# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: unicode-emoji"
DESCRIPTION = "[Emoji 16.0] Provides Unicode Emoji data and regexes, incorporating the latest Unicode and Emoji standards"
HOMEPAGE = "https://github.com/janlelis/unicode-emoji"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=92a470b2948f3b94ca06cdb8d9723330"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5ed0612a680cd04bfe9d3844b2d4f2f4"
SRC_URI[sha256sum] = "2c2c4ef7f353e5809497126285a50b23056cc6e61b64433764a35eff6c36532a"

GEM_NAME = "unicode-emoji"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
