# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: multi_json"
DESCRIPTION = "A common interface to multiple JSON libraries, including Oj, Yajl, the JSON gem (with C-extensions), gson, JrJackson, and OkJson."
HOMEPAGE = "https://github.com/sferik/multi_json"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b26911bc7dc7c4200aebe5ade90d873e"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9e551528a833dbd5e77326d508c88936"
SRC_URI[sha256sum] = "111f3120b69989829e7819321e3f626b943c04017cedf912b8fc7125fefa7636"

GEM_NAME = "multi_json"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
