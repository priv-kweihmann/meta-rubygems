# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: net-sftp"
DESCRIPTION = "A pure Ruby implementation of the SFTP client protocol"
HOMEPAGE = "https://github.com/net-ssh/net-sftp"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6c99c0cc0901fbc3607fe997f9898d69"

DEPENDS:class-native += "\
    rubygems-net-ssh-native \
"
RDEPENDS:${PN}:class-target += "\
    rubygems-net-ssh \
"

SRC_URI[md5sum] = "d89acb5ec101ca53c8c8303c3e0a7bbe"
SRC_URI[sha256sum] = "b1a2d6cd0bfe8b38f2c199614b86591455f582dbdd6211c95af861fb97d7bba0"

GEM_NAME = "net-sftp"



inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
