# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: ruby-termios"
DESCRIPTION = "Termios module is simple wrapper of termios(3).    It can be included into IO-family classes and can extend IO-family objects.    In addition, the methods can use as module function."
HOMEPAGE = "https://github.com/arika/ruby-termios"

LICENSE = "Ruby"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Ruby;md5=105fc57d3f4d3122db32912f3e6107d0"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "6f2077e10327d62a24c1569a7df97d11"
SRC_URI[sha256sum] = "d05b3f18d64c27da81ebab32540b3fbeb4428a4b2f6238c290d42acdd20ff375"

GEM_NAME = "ruby-termios"

inherit rubygems
inherit rubygentest
inherit pkgconfig

INSANE_SKIP:${PN} += "rpaths"

BBCLASSEXTEND = "native"
