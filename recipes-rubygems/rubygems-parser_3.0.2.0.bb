# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: parser"
DESCRIPTION = "A Ruby parser written in pure Ruby."
HOMEPAGE = "https://github.com/whitequark/parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c66fb0a7723eeead586d670198ad6a34"

EXTRA_DEPENDS:append = " \
    rubygems-gauntlet \
"

DEPENDS:class-native += "\
    rubygems-ast-native \
"

SRC_URI[md5sum] = "a63cf411d1bea736d1959d2ede7fbc4e"
SRC_URI[sha256sum] = "05766daec0e44fe986067d948e2ed8d23656ad072442f213b314c17b1037aa1a"

GEM_NAME = "parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ast \
"

BBCLASSEXTEND = "native"
