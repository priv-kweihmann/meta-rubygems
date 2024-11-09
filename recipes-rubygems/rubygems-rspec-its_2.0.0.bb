# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rspec-its"
DESCRIPTION = "RSpec extension gem for attribute matching"
HOMEPAGE = "https://github.com/rspec/rspec-its"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7cfefc3a37436b88dfc9476482d436d9"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-rspec-core-native \
    rubygems-rspec-expectations-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "050592d0b6a3d1692d944051ae46498c"
SRC_URI[sha256sum] = "a88e8bc38149f2835e93533591ec4f5c829aacbfd41269a2e6f9f5b82f5260df"

GEM_NAME = "rspec-its"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_install:append() {
    # get rid of a bash dependency
    rm -rf ${GEM_HOME}/gems/rspec-its-${PV}/script/
}

RDEPENDS:${PN}:class-target += "\
    rubygems-rspec-core \
    rubygems-rspec-expectations \
"

BBCLASSEXTEND = "native"
