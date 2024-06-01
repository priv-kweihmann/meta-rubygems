# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mini_portile2"
DESCRIPTION = "Simple autoconf and cmake builder for developers"
HOMEPAGE = "https://github.com/flavorjones/mini_portile"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ca91f53befc541b9880a8502e7d2699d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "64233649a8f3a0e13efdef0f1cee1e0f"
SRC_URI[sha256sum] = "13eef5ab459bbfd33d61e539564ec25a9c2cf593b0a5ea6d4d7ef8c19b162ee0"

GEM_NAME = "mini_portile2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
