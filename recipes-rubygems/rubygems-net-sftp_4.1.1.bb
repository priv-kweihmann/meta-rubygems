# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: net-sftp"
DESCRIPTION = "A pure Ruby implementation of the SFTP client protocol"
HOMEPAGE = "https://github.com/net-ssh/net-sftp"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6c99c0cc0901fbc3607fe997f9898d69"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-net-ssh-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e67aabbcf2449f7e4de7d0709ffe5feb"
SRC_URI[sha256sum] = "dc2019e59e3e3552943b576f14cb0201ec55823935b967e10dcda169b04e4573"

GEM_NAME = "net-sftp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-net-ssh \
"

BBCLASSEXTEND = "native"
