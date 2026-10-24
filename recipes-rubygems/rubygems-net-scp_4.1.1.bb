# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: net-scp"
DESCRIPTION = "A pure Ruby implementation of the SCP client protocol"
HOMEPAGE = "https://github.com/net-ssh/net-scp"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6c99c0cc0901fbc3607fe997f9898d69"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-net-ssh-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "337596a5628b81581651b0879caa77cf"
SRC_URI[sha256sum] = "6017d1af1ca175cb193e8a33ca4bb7c53ddd40de7a050643b3b15ec386b2d392"

GEM_NAME = "net-scp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-net-ssh \
"

BBCLASSEXTEND = "native"
