# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: net-ssh"
DESCRIPTION = "Net::SSH: a pure-Ruby implementation of the SSH2 client protocol"
HOMEPAGE = "https://github.com/net-ssh/net-ssh"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6c99c0cc0901fbc3607fe997f9898d69"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "87a56075ffe2f85c6b693951742cdc31"
SRC_URI[sha256sum] = "2a28f177173d1f6bef77471fa927c73959cda36cd03772e117f2fec48f34d2cb"

GEM_NAME = "net-ssh"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
