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

SRC_URI[md5sum] = "b32c129ce4ce92aa429203eb95fcecca"
SRC_URI[sha256sum] = "9ccb5e49b007a7d0050980c708e3f178769edfe710379a5d92d32fa97eda31c3"

GEM_NAME = "net-ssh"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-logger \
    rubygems-openssl \
"

BBCLASSEXTEND = "native"
