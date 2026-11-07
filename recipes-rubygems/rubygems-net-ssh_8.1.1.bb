# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: net-ssh"
DESCRIPTION = "Net::SSH: a pure-Ruby implementation of the SSH2 client protocol"
HOMEPAGE = "https://github.com/net-ssh/net-ssh"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6c99c0cc0901fbc3607fe997f9898d69"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-logger-native \
    rubygems-openssl-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "9865f526e8dc67aed0a28da0f5d40697"
SRC_URI[sha256sum] = "8283aa541f89155ce55296ee7888d7082dd9b7bb7c9b7bdbd114c4cc4b52508d"

GEM_NAME = "net-ssh"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-logger \
    rubygems-openssl \
"

BBCLASSEXTEND = "native"
