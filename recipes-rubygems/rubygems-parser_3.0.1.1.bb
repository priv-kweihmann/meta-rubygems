# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: parser"
DESCRIPTION = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c66fb0a7723eeead586d670198ad6a34"

EXTRA_RDEPENDS += "\
    rubygems-gauntlet \
"

DEPENDS_class-native += "\
    rubygems-ast-native \
"

SRC_URI[md5sum] = "86a99e6f0794dcb398cca9e7f905b36d"
SRC_URI[sha256sum] = "d2ded2eab569bb7bee861790a54a81e71ce4b4a25bf908bfeb06945f6288badf"

GEM_NAME = "parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-ast \
"

BBCLASSEXTEND = "native"
