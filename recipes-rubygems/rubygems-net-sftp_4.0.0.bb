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

SRC_URI[md5sum] = "f3e1ca6862e10966bb65a97e4446fb98"
SRC_URI[sha256sum] = "65bb91c859c2f93b09826757af11b69af931a3a9155050f50d1b06d384526364"

GEM_NAME = "net-sftp"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-net-ssh \
"

BBCLASSEXTEND = "native"
