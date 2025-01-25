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

SRC_URI[md5sum] = "110c4e22fcfd0dbf94c10684e90fbe63"
SRC_URI[sha256sum] = "a99b0b92a1e5d360b0de4ffbf2dc0c91531502d3d4f56c28b0139a7c093d1a5d"

GEM_NAME = "net-scp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-net-ssh \
"

BBCLASSEXTEND = "native"
