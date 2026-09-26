# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: unicode-emoji"
DESCRIPTION = "[Emoji 18.0] Provides Unicode Emoji data and regexes, incorporating the latest Unicode and Emoji standards"
HOMEPAGE = "https://github.com/janlelis/unicode-emoji"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=1015d609fccbc31e232f7f780b903f9b"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0c47df4728cba0dedd43456a16fde8f7"
SRC_URI[sha256sum] = "11c02fa73290378c066bb0562cd4c87d8e1b706fbbe0059ca12746a4244de8ce"

GEM_NAME = "unicode-emoji"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
