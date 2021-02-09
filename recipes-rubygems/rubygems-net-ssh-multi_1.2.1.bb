# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: net-ssh-multi"
DESCRIPTION = "Control multiple Net::SSH connections via a single interface."
HOMEPAGE = "https://github.com/net-ssh/net-scp"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6c99c0cc0901fbc3607fe997f9898d69"

DEPENDS_class-native += "\
    rubygems-net-ssh-gateway-native \
    rubygems-net-ssh-native \
"
RDEPENDS_${PN}_class-target += "\
    rubygems-net-ssh \
    rubygems-net-ssh-gateway \
"

SRC_URI[md5sum] = "618b8f5fe6d80e6823bdf53c1d5d7c3d"
SRC_URI[sha256sum] = "e154105859d5cd30e132aaf9eff735d1f766d756f713a21bab29bf6956fa7d8e"

GEM_NAME = "net-ssh-multi"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
