# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: unicode-emoji"
DESCRIPTION = "[Emoji 17.0] Provides Unicode Emoji data and regexes, incorporating the latest Unicode and Emoji standards"
HOMEPAGE = "https://github.com/janlelis/unicode-emoji"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=92a470b2948f3b94ca06cdb8d9723330"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "789f46e7a85eacb629505b6dabd17990"
SRC_URI[sha256sum] = "4997d2d5df1ed4252f4830a9b6e86f932e2013fbff2182a9ce9ccabda4f325a5"

GEM_NAME = "unicode-emoji"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
