# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: yard"
DESCRIPTION = "YARD is a documentation generation tool for the Ruby programming language.    It enables the user to generate consistent, usable documentation that can be    exported to a number of formats very easily, and also supports extending for    custom Ruby constructs such as custom class level definitions."
HOMEPAGE = "http://yardoc.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b6f9769ae84eb7b621febf5cc8c5c62"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "ffaaaaafc1257e3bb98aea44fa47c05d"
SRC_URI[sha256sum] = "5505736c1b00c926f71053a606ab75f02070c5960d0778b901fe9d8b0a470be4"

GEM_NAME = "yard"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
