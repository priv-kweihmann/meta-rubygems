# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: specinfra"
DESCRIPTION = "Common layer for serverspec and itamae"
HOMEPAGE = "https://github.com/mizzy/specinfra"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9f1e84c559b0d54e801ddbe1457c114a"

DEPENDS_class-native += "\
    rubygems-net-scp-native \
    rubygems-net-ssh-native \
    rubygems-net-telnet-native \
    rubygems-sfl-native \
"
RDEPENDS_${PN}_class-target += "\
    rubygems-net-scp \
    rubygems-net-ssh \
    rubygems-net-telnet \
    rubygems-sfl \
"

SRC_URI[md5sum] = "8e4b79e50abfb8dab8ef60d487b9fa63"
SRC_URI[sha256sum] = "4acb241db91ce1832f78be0ec195f2a736b07e87c565c5d82624575d1144e178"

GEM_NAME = "specinfra"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
