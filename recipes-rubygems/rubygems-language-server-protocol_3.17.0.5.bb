# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: language_server-protocol"
DESCRIPTION = "A Language Server Protocol SDK"
HOMEPAGE = "https://github.com/mtsmfm/language_server-protocol-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2580c2645bc754fdfb8f36610f09e7f5"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f5a9b791995a061c5a420b4e5e54bf9c"
SRC_URI[sha256sum] = "fd1e39a51a28bf3eec959379985a72e296e9f9acfce46f6a79d31ca8760803cc"

GEM_NAME = "language_server-protocol"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
