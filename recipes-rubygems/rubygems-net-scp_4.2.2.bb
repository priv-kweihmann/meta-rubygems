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

SRC_URI[md5sum] = "8eb4e7d932c13d01e064586c5a1956fa"
SRC_URI[sha256sum] = "af26fa536fb1fe5a3e77e0095d00685eca58fa49c28968f4fabc52fea21d35a2"

GEM_NAME = "net-scp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-net-ssh \
"

BBCLASSEXTEND = "native"
