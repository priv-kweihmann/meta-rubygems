# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: multi_json"
DESCRIPTION = "A common interface to multiple JSON libraries, including Oj, Yajl, the JSON gem (with C-extensions), gson, JrJackson, and OkJson."
HOMEPAGE = "https://github.com/sferik/multi_json"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b26911bc7dc7c4200aebe5ade90d873e"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2bfe72501a68665e2651357688337183"
SRC_URI[sha256sum] = "23f70cf73e2895a33e6d10f0ec955b28ef5627ca4bbad0f292e7d16f4675596f"

GEM_NAME = "multi_json"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
