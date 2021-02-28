# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: parser"
DESCRIPTION = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c66fb0a7723eeead586d670198ad6a34"

EXTRA_RDEPENDS += "rubygems-gauntlet"

DEPENDS_class-native += "\
    rubygems-ast-native \
"

SRC_URI[md5sum] = "19b109f305cea837b85573a5385e12a7"
SRC_URI[sha256sum] = "b4963d5502dc4912f4f2ec6d93f3f6d9db075bced28195032b12f8fafd543dca"

GEM_NAME = "parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-ast \
"

BBCLASSEXTEND = "native"
