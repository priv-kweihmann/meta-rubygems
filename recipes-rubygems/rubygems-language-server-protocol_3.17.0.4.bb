# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: language_server-protocol"
DESCRIPTION = "A Language Server Protocol SDK"
HOMEPAGE = "https://github.com/mtsmfm/language_server-protocol-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2580c2645bc754fdfb8f36610f09e7f5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "5f6917e87ba7beb5928969650c9ac775"
SRC_URI[sha256sum] = "c484626478664fd13482d8180947c50a8590484b1258b99b7aedb3b69df89669"

GEM_NAME = "language_server-protocol"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
