# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: net-ssh"
DESCRIPTION = "Net::SSH: a pure-Ruby implementation of the SSH2 client protocol"
HOMEPAGE = "https://github.com/net-ssh/net-ssh"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6c99c0cc0901fbc3607fe997f9898d69"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "2ac500ae0a9c578b64d8c3a4bff741c0"
SRC_URI[sha256sum] = "59a7607d93b7c97979df51afbaa97ac6e6fcd315778151c0b521ca13178ae3e2"

GEM_NAME = "net-ssh"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
