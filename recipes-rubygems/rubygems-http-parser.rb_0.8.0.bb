# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: http_parser.rb"
DESCRIPTION = "Ruby bindings to https://github.com/joyent/http-parser and https://github.com/http-parser/http-parser.java"
HOMEPAGE = "https://github.com/tmm1/http_parser.rb"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=157efc3766c6d07d3d857ebbab43351a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0690ec409307264ce75df0bf9fe4ae00"
SRC_URI[sha256sum] = "5a0932f1fa82ce08a8516a2685d5a86031c000560f89946913c555a0697544be"

GEM_NAME = "http_parser.rb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
