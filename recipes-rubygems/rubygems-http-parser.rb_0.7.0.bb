# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: http_parser.rb"
DESCRIPTION = "Ruby bindings to https://github.com/joyent/http-parser and https://github.com/http-parser/http-parser.java"
HOMEPAGE = "https://github.com/tmm1/http_parser.rb"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=157efc3766c6d07d3d857ebbab43351a"

SRC_URI[md5sum] = "88f00f53f4d3c26ba6527b6a228d513c"
SRC_URI[sha256sum] = "176ab661633ed25a11a415a745cd82957eaa6eed414aec3327809ae848300af6"

GEM_NAME = "http_parser.rb"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
