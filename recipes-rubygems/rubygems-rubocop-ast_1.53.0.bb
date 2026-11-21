# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rubocop-ast"
DESCRIPTION = "RuboCop's Node and NodePattern classes."
HOMEPAGE = "https://www.rubocop.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=04ca7628e4fc69bcdd742603357bdfa6"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-ast-native \
    rubygems-parser-native \
    rubygems-prism-native \
    rubygems-racc-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0a891f2046daf3689ba8779e31f55c8c"
SRC_URI[sha256sum] = "027984d28485d6502ae4c72f9341080f54f538599f5dbb54f81875a4ddcad574"

GEM_NAME = "rubocop-ast"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ast \
    rubygems-parser \
    rubygems-prism \
    rubygems-racc \
"

BBCLASSEXTEND = "native"
