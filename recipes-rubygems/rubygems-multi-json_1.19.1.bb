# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: multi_json"
DESCRIPTION = "A common interface to multiple JSON libraries, including fast_jsonparser, Oj, Yajl, the JSON gem (with C-extensions), gson, JrJackson, and OkJson."
HOMEPAGE = "https://github.com/sferik/multi_json"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b26911bc7dc7c4200aebe5ade90d873e"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "674a893152c8a833db2d44f78778ef10"
SRC_URI[sha256sum] = "7aefeff8f2c854bf739931a238e4aea64592845e0c0395c8a7d2eea7fdd631b7"

GEM_NAME = "multi_json"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
