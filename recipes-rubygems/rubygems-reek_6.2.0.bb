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

SRC_URI[md5sum] = "fc8898790e8803f918f34f2ba0787a6f"
SRC_URI[sha256sum] = "b08c1f5790b19e000a3eec7e1f41ab1676ae0ac6db5ae891288e17ca2e036f2c"

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
