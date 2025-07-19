# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: multi_json"
DESCRIPTION = "A common interface to multiple JSON libraries, including Oj, Yajl, the JSON gem (with C-extensions), gson, JrJackson, and OkJson."
HOMEPAGE = "https://github.com/sferik/multi_json"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b26911bc7dc7c4200aebe5ade90d873e"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d16554b5a8c571e1fe10fe4bfa877220"
SRC_URI[sha256sum] = "76581f6c96aebf2e85f8a8b9854829e0988f335e8671cd1a56a1036eb75e4a1b"

GEM_NAME = "multi_json"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
