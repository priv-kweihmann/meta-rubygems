# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: recursive-open-struct"
DESCRIPTION = "RecursiveOpenStruct is a subclass of OpenStruct"
HOMEPAGE = "https://github.com/aetherknight/recursive-open-struct"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cefab505e7fa3397fcf76646bf481046"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "3d21d5e68008c595a5351f572c89ef6a"
SRC_URI[sha256sum] = "8309487cfc945dfdcd417c52940a8e27cac67b311e573a6b1abbd84f00425ae6"

GEM_NAME = "recursive-open-struct"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
