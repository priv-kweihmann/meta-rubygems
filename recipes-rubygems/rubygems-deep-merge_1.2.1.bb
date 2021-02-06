# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: deep_merge"
DESCRIPTION = "Recursively merge hashes."
HOMEPAGE = "https://github.com/danielsdeleo/deep_merge"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40522ec22c562bf3cca73d5973a66077"

SRC_URI[md5sum] = "8d8396705375ac646454b1d64ad1239a"
SRC_URI[sha256sum] = "4b57776cf10d241dfccaf8912d8152bf330fc5acd0e6bafc6c3df47f388b77e0"

GEM_NAME = "deep_merge"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
