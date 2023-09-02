# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: serverspec"
DESCRIPTION = "RSpec tests for your servers configured by Puppet, Chef, Itamae or anything else"
HOMEPAGE = "http://serverspec.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9f1e84c559b0d54e801ddbe1457c114a"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-multi-json-native \
    rubygems-rspec-its-native \
    rubygems-rspec-native \
    rubygems-specinfra-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "800fea9f3e6c2a240b11e696fcbb8ffd"
SRC_URI[sha256sum] = "64a90a6a8f0b49ccfb59dcfa5d549ad5744afa962be3e2dbb0c853eb71c6ca4d"

GEM_NAME = "serverspec"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-multi-json \
    rubygems-rspec \
    rubygems-rspec-its \
    rubygems-specinfra \
"

BBCLASSEXTEND = "native"
