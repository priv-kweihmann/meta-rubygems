# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: reek"
DESCRIPTION = "Reek is a tool that examines Ruby classes, modules and methods and reports any code smells it finds."
HOMEPAGE = "https://github.com/troessner/reek"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.txt;md5=59252b93b9ae85dab91487d72990f77c"

EXTRA_DEPENDS:append = " \
    rubygems-codeclimate-engine-rb \
"
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-kwalify-native \
    rubygems-parser-native \
    rubygems-rainbow-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "fdabc51b0b0cd1f50093d064008e1ca4"
SRC_URI[sha256sum] = "f8d07597ad22be56da8bd83da1c45f195351f80b3fe68363883da77ed611b44d"

GEM_NAME = "reek"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-kwalify \
    rubygems-parser \
    rubygems-rainbow \
"

BBCLASSEXTEND = "native"
