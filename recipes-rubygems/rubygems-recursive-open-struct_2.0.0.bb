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

SRC_URI[md5sum] = "50ad857459442b207d3f37c48d8c3fb9"
SRC_URI[sha256sum] = "8f682935042b672d798edf72fe94687a8e4462a5ba0a7a4a7bc1f2dac2e46485"

GEM_NAME = "recursive-open-struct"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ostruct \
"

BBCLASSEXTEND = "native"
