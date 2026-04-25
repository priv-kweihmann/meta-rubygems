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

SRC_URI[md5sum] = "777edf8d200c8dd57b65bbe16f6cdc8e"
SRC_URI[sha256sum] = "27da6192b803b618bd866eb6d7bb92b18f608ab6a71796522d9d890906a25392"

GEM_NAME = "recursive-open-struct"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ostruct \
"

BBCLASSEXTEND = "native"
