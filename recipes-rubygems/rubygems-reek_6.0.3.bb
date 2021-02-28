# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: reek"
DESCRIPTION = "Reek is a tool that examines Ruby classes, modules and methods and reports any code smells it finds."
HOMEPAGE = "https://github.com/troessner/reek"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.txt;md5=59252b93b9ae85dab91487d72990f77c"

EXTRA_RDEPENDS += "rubygems-codeclimate-engine-rb"

DEPENDS_class-native += "\
    rubygems-kwalify-native \
    rubygems-parser-native \
    rubygems-psych-native \
    rubygems-rainbow-native \
"

SRC_URI[md5sum] = "946ff94aaf22808e07117f0dd912251e"
SRC_URI[sha256sum] = "e262cc8ce4cce4ea259bcdcc50f9c4a90d39f3e0e93b9d42f0c400d882dc8efe"

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
