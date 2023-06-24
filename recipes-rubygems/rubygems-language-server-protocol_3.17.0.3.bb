# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: language_server-protocol"
DESCRIPTION = "A Language Server Protocol SDK"
HOMEPAGE = "https://github.com/mtsmfm/language_server-protocol-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2580c2645bc754fdfb8f36610f09e7f5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d8ab933a33865dd0a99124a6f5d1b08e"
SRC_URI[sha256sum] = "3d5c58c02f44a20d972957a9febe386d7e7468ab3900ce6bd2b563dd910c6b3f"

GEM_NAME = "language_server-protocol"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
