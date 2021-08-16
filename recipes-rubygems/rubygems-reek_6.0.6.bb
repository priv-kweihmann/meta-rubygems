# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: reek"
DESCRIPTION = "Reek is a tool that examines Ruby classes, modules and methods and reports any code smells it finds."
HOMEPAGE = "https://github.com/troessner/reek"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.txt;md5=59252b93b9ae85dab91487d72990f77c"

EXTRA_RDEPENDS_append = " \
    rubygems-codeclimate-engine-rb \
"

DEPENDS:class-native += "\
    rubygems-kwalify-native \
    rubygems-parser-native \
    rubygems-rainbow-native \
"

SRC_URI[md5sum] = "7cf7847d9e221fa47d0b08a137867ca0"
SRC_URI[sha256sum] = "baf919d91746450b12780522705a8c06f16cd22a3b2a057ed6c9c93491e1c1f0"

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
