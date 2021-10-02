# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: excon"
DESCRIPTION = "EXtended http(s) CONnections"
HOMEPAGE = "https://github.com/excon/excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8b04a0291ec55b31563a50b191b72cb1"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "88e8b15da02aaf34b33f5cb9adf732bb"
SRC_URI[sha256sum] = "674a0a86a16693c913cf33a36d64af718d09cbc674d973650cc3ec1e07d1c55d"

GEM_NAME = "excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
