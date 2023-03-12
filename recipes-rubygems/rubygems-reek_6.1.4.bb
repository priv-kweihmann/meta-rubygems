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

SRC_URI[md5sum] = "25c973c215f46b71712bd3aca16b7dd1"
SRC_URI[sha256sum] = "9966969b8480ed343d89397a4399c20b26588fb053753982215fdad7f652d08a"

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
