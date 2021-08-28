# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: fast_gettext"
DESCRIPTION = "A simple, fast, memory-efficient and threadsafe implementation of GetText"
HOMEPAGE = "https://github.com/grosser/fast_gettext"

LICENSE = "MIT & Ruby"
LIC_FILES_CHKSUM = "file://lib/fast_gettext/vendor/string.rb;beginline=7;endline=7;md5=27f370e21efbc2fe795eed381d85ecd5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "96084779e064eb2cf2d7d5c3b3a74c10"
SRC_URI[sha256sum] = "0d095dbc5a003b3caea13b9569288703086ae05aac2cc6d7b0881c8e0a07ae15"

GEM_NAME = "fast_gettext"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
