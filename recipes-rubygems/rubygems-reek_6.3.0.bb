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
    rubygems-parser-native \
    rubygems-rainbow-native \
    rubygems-rexml-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f6464cdc53f23fdb37de17d4663513d2"
SRC_URI[sha256sum] = "4501c45ad75038e1f04030a7ddb6ad18c9bcc9ba62a0b3827e430b342f582ae7"

GEM_NAME = "reek"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-dry-schema \
    rubygems-parser \
    rubygems-rainbow \
    rubygems-rexml \
"

BBCLASSEXTEND = "native"
