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

SRC_URI[md5sum] = "ffd129ad759bc598758c10e0303dfebf"
SRC_URI[sha256sum] = "c85b1a45f0ca95dec189e29515b1d829dd234fccef523697367dad1c13223113"

GEM_NAME = "parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-ast \
"

BBCLASSEXTEND = "native"
