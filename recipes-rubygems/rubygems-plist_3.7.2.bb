# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: plist"
DESCRIPTION = "Plist is a library to manipulate Property List files, also known as plists"
HOMEPAGE = "https://github.com/patsplat/plist"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e8d008d5070d56bbd0361ddc7178b9e4"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "c00d30ce577e4685cd065a2eb8512f4b"
SRC_URI[sha256sum] = "d37a4527cc1116064393df4b40e1dbbc94c65fa9ca2eec52edf9a13616718a42"

GEM_NAME = "plist"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
