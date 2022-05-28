# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: yajl-ruby"
DESCRIPTION = "Ruby C bindings to the excellent Yajl JSON stream-based parser library."
HOMEPAGE = "https://github.com/brianmario/yajl-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dbd3a9f471247a243db5b62fe091587"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0aaeceee57c9c5a19a562afc3bb4e27f"
SRC_URI[sha256sum] = "8c974d9c11ae07b0a3b6d26efea8407269b02e4138118fbe3ef0d2ec9724d1d2"

GEM_NAME = "yajl-ruby"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
