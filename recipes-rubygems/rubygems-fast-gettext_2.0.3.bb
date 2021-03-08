# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: fast_gettext"
DESCRIPTION = "A simple, fast, memory-efficient and threadsafe implementation of GetText"
HOMEPAGE = "https://github.com/grosser/fast_gettext"

LICENSE = "MIT & Ruby"
LIC_FILES_CHKSUM = "file://lib/fast_gettext/vendor/string.rb;beginline=7;endline=7;md5=27f370e21efbc2fe795eed381d85ecd5"

SRC_URI[md5sum] = "347b2ce049980e4f3050510b2ab58ab4"
SRC_URI[sha256sum] = "23a12062ee42444728a3472e6266b1b631c35022122b2af5b1226297053f8c68"

GEM_NAME = "fast_gettext"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
