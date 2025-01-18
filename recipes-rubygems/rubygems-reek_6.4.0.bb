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
    rubygems-dry-schema-native \
    rubygems-logger-native \
    rubygems-parser-native \
    rubygems-rainbow-native \
    rubygems-rexml-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "4b637cefb9854472d4f9c35615730af0"
SRC_URI[sha256sum] = "80f9a14979aa3ffaecfb2b8b10bdf87fcd8a0fca47c36823e2a4e1e62f1ddd47"

GEM_NAME = "reek"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-dry-schema \
    rubygems-logger \
    rubygems-parser \
    rubygems-rainbow \
    rubygems-rexml \
"

BBCLASSEXTEND = "native"
