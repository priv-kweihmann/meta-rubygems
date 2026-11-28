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

SRC_URI[md5sum] = "64118dac4fb9cb0cfead8b007376346c"
SRC_URI[sha256sum] = "e0499eee81bd098cb84e735c597e8fb04f5638b727b67211b2b747354567b77a"

GEM_NAME = "net-sftp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-net-ssh \
"

BBCLASSEXTEND = "native"
