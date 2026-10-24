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

SRC_URI[md5sum] = "3b0a0b621be6273084ceddee20137fbc"
SRC_URI[sha256sum] = "8d2010b3ba6f7bf5c470aac5e77647d29b2a4dcf000346bafc3c99c439d1c29b"

GEM_NAME = "net-ssh"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-logger \
    rubygems-openssl \
"

BBCLASSEXTEND = "native"
