# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: excon"
DESCRIPTION = "EXtended http(s) CONnections"
HOMEPAGE = "https://github.com/excon/excon"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8b04a0291ec55b31563a50b191b72cb1"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "a00006a7ee29109ce13448c9810203d9"
SRC_URI[sha256sum] = "55aec8c19d1f7cbb328e3b4980c8136645b3c9d591ecd1afed3d1dee7773d9b3"

GEM_NAME = "excon"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
