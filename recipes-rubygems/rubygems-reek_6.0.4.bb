# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: reek"
DESCRIPTION = "Reek is a tool that examines Ruby classes, modules and methods and reports any code smells it finds."
HOMEPAGE = "https://github.com/troessner/reek"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.txt;md5=59252b93b9ae85dab91487d72990f77c"

EXTRA_RDEPENDS += "\
    rubygems-codeclimate-engine-rb \
"

DEPENDS_class-native += "\
    rubygems-kwalify-native \
    rubygems-parser-native \
    rubygems-psych-native \
    rubygems-rainbow-native \
"

SRC_URI[md5sum] = "275f3a29a87228a4f6b2de3940dbf532"
SRC_URI[sha256sum] = "b70bc41d2f2a34eba744060337752c4575e0b5ac4cf10a86b3afaaf78fc3054a"

GEM_NAME = "reek"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-kwalify \
    rubygems-parser \
    rubygems-psych \
    rubygems-rainbow \
"

BBCLASSEXTEND = "native"
