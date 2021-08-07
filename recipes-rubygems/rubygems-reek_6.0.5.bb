# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: reek"
DESCRIPTION = "Reek is a tool that examines Ruby classes, modules and methods and reports any code smells it finds."
HOMEPAGE = "https://github.com/troessner/reek"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.txt;md5=59252b93b9ae85dab91487d72990f77c"

EXTRA_RDEPENDS += "\
    rubygems-codeclimate-engine-rb \
"

DEPENDS:class-native += "\
    rubygems-kwalify-native \
    rubygems-parser-native \
    rubygems-psych-native \
    rubygems-rainbow-native \
"

SRC_URI[md5sum] = "80ce170c086b22b07009256658dd7e36"
SRC_URI[sha256sum] = "98b83ad7e96015d3db55f6efab795aff45e8eefbcb17db01894e0636e859d3e9"

GEM_NAME = "reek"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-kwalify \
    rubygems-parser \
    rubygems-psych \
    rubygems-rainbow \
"

BBCLASSEXTEND = "native"
