# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: mini_portile2"
DESCRIPTION = "Simple autoconf and cmake builder for developers"
HOMEPAGE = "https://github.com/flavorjones/mini_portile"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ca91f53befc541b9880a8502e7d2699d"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0d8a4ba2e286b8f36b869997af6f3ecf"
SRC_URI[sha256sum] = "7a37db8ae758086c3c3ac3a59c036704d331e965d5e106635e4a42d6e66089ce"

GEM_NAME = "mini_portile2"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
