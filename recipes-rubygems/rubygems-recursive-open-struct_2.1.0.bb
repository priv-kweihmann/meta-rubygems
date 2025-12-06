# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: recursive-open-struct"
DESCRIPTION = "RecursiveOpenStruct is a subclass of OpenStruct"
HOMEPAGE = "https://github.com/aetherknight/recursive-open-struct"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cefab505e7fa3397fcf76646bf481046"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-ostruct-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "e8825bfd1e648f4b6c9dc04bd81de04a"
SRC_URI[sha256sum] = "139db05f937e51b15b950f081cf46168c388a78ca5b271dc14099cfff38c7367"

GEM_NAME = "recursive-open-struct"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ostruct \
"

BBCLASSEXTEND = "native"
