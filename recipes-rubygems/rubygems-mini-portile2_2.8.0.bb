# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mini_portile2"
DESCRIPTION = "Simplistic port-like solution for developers"
HOMEPAGE = "https://github.com/flavorjones/mini_portile"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ca91f53befc541b9880a8502e7d2699d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "7e1d00127f4d447bf81f229dec9fd02a"
SRC_URI[sha256sum] = "1e06b286ff19b73cfc9193cb3dd2bd80416f8262443564b25b23baea74a05765"

GEM_NAME = "mini_portile2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
