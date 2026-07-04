# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: language_server-protocol"
DESCRIPTION = "A Language Server Protocol SDK"
HOMEPAGE = "https://github.com/mtsmfm/language_server-protocol-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2580c2645bc754fdfb8f36610f09e7f5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f5f0d90321d797d2eb47d49197bbecdd"
SRC_URI[sha256sum] = "5ef2c0c138f8267e1bc631d3328347d354f96724b0af22f2c79516120443b7f0"

GEM_NAME = "language_server-protocol"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
