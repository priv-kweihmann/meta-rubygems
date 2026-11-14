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

SRC_URI[md5sum] = "1a41eaeb28f459a815c49c32468c3166"
SRC_URI[sha256sum] = "78ce245aba70b5b8dab6226b335a7f359e0ba062fef6a1bc57bad32bee22778e"

GEM_NAME = "net-ssh"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-logger \
    rubygems-openssl \
"

BBCLASSEXTEND = "native"
