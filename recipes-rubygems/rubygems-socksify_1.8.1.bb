# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: socksify"
DESCRIPTION = "Redirect all TCPSockets through a SOCKS5 proxy"
HOMEPAGE = "https://github.com/astro/socksify-ruby"

LICENSE = "Ruby & GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "662e7e9e4d60238a280340e0293a4741"
SRC_URI[sha256sum] = "cf2a01720cc32490cc657b3233730620a03b92e98281726872ebebedfea9a856"

GEM_NAME = "socksify"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
