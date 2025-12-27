# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: http_parser.rb"
DESCRIPTION = "Ruby bindings to https://github.com/joyent/http-parser and https://github.com/http-parser/http-parser.java"
HOMEPAGE = "https://github.com/tmm1/http_parser.rb"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=157efc3766c6d07d3d857ebbab43351a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e9076a195360ed822cc0f479ac186006"
SRC_URI[sha256sum] = "9ae8df145b39aa5398b2f90090d651c67bd8e2ebfe4507c966579f641e11097a"

GEM_NAME = "http_parser.rb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

INSANE_SKIP:${PN} += "rpaths"

BBCLASSEXTEND = "native"
