# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: parser"
DESCRIPTION = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c66fb0a7723eeead586d670198ad6a34"

EXTRA_DEPENDS:append = " \
    rubygems-gauntlet \
"
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-ast-native \
    rubygems-racc-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0e9975ff5d077c49ea2cbe1312c095ee"
SRC_URI[sha256sum] = "7748313e505ca87045dc0465c776c802043f777581796eb79b1654c5d19d2687"

GEM_NAME = "parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ast \
    rubygems-racc \
"

BBCLASSEXTEND = "native"
