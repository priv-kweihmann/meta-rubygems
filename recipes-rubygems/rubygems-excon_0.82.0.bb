# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: excon"
DESCRIPTION = "EXtended http(s) CONnections"
HOMEPAGE = "https://github.com/excon/excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8b04a0291ec55b31563a50b191b72cb1"

SRC_URI[md5sum] = "751bef9cb67f86c4e6b73a12b6bd5aac"
SRC_URI[sha256sum] = "6a1641e9b5725ee9a973869458a7d740ae72e3f60d976eb0e7a2341dabf6a984"

GEM_NAME = "excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
