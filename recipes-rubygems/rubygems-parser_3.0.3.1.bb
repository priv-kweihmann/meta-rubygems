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

SRC_URI[md5sum] = "5a602ed056f8cf4e4d2ba82a39e3bb44"
SRC_URI[sha256sum] = "8309817593b609dec31b887ce9720bc1897ea71ce0ce5ff44ef145ce956c73ea"

GEM_NAME = "parser"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-ast \
"

BBCLASSEXTEND = "native"
