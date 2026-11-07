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

SRC_URI[md5sum] = "4d3fb592e526461efa21332cbc2d0e27"
SRC_URI[sha256sum] = "5c9ff6743da37eef6746f248043d97d2bbf3910a4694ec8e372326ec588c2394"

GEM_NAME = "net-scp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-net-ssh \
"

BBCLASSEXTEND = "native"
