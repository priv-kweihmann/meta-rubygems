# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: http_parser.rb"
DESCRIPTION = "Ruby bindings to http://github.com/ry/http-parser and http://github.com/a2800276/http-parser.java"
HOMEPAGE = "http://github.com/tmm1/http_parser.rb"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=157efc3766c6d07d3d857ebbab43351a"

SRC_URI[md5sum] = "1c9d471b7fd78d5857d6d12fe016278e"
SRC_URI[sha256sum] = "f11d0aec50ef26a7d1f991e627ac88acdb5979282aeba7a5c3be6ce0636ed196"

GEM_NAME = "http_parser.rb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
