# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: yajl-ruby"
DESCRIPTION = "Ruby C bindings to the excellent Yajl JSON stream-based parser library."
HOMEPAGE = "http://github.com/brianmario/yajl-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dbd3a9f471247a243db5b62fe091587"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "92fe174fb47bee2255ed950ee9ab3c51"
SRC_URI[sha256sum] = "8228a1de1b53e346de619c5dcb0ed2ac82cc4c9ca6b0a41fc5bae98ee2c7cc51"

GEM_NAME = "yajl-ruby"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
