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

SRC_URI[md5sum] = "937d7d7de5ec973fda5f4329c99d6bfb"
SRC_URI[sha256sum] = "0207ed5f4066a63767ea7332211e6aaf793c047bb33ad1f7946aa5983d4b8e77"

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
