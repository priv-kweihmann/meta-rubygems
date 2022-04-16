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

SRC_URI[md5sum] = "200b0c40b91990b035ce599e9a347360"
SRC_URI[sha256sum] = "eda4d7b49bbfddad3b6ca9cdfb23302eec6cf73c2e808b6d5b0cc9161f7c0e76"

GEM_NAME = "parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ast \
"

BBCLASSEXTEND = "native"
