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

SRC_URI[md5sum] = "04d5454cb445b028981c4475df0277b1"
SRC_URI[sha256sum] = "e58cb0ebcaf0161f4a9ddc7fc54e160d97bc50bc774547817287728245d022d0"

GEM_NAME = "net-sftp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-net-ssh \
"

BBCLASSEXTEND = "native"
