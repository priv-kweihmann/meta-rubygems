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
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d1be26b9a3fb35c1c045bce7a1d81048"
SRC_URI[sha256sum] = "4593da6a6c0dc1b0a0b47b68aa79c36655e19b9d8636f7c27d02a76cb7840e9f"

GEM_NAME = "parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ast \
"

BBCLASSEXTEND = "native"
