# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: excon"
DESCRIPTION = "EXtended http(s) CONnections"
HOMEPAGE = "https://github.com/excon/excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8b04a0291ec55b31563a50b191b72cb1"

SRC_URI[md5sum] = "cec0507827e05f04e7d53cf865e4f729"
SRC_URI[sha256sum] = "e7c78b2114c42e06024fb9812fc5a6b9a984ed973f585c09c67f5ae6e7b6e5a5"

GEM_NAME = "excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
