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

SRC_URI[md5sum] = "677f62be3b823df0ee2f930af7837755"
SRC_URI[sha256sum] = "29cddb522e99df84d1ca600a1e2dab4eaf0be80fe40e90e498585570f6de9025"

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
