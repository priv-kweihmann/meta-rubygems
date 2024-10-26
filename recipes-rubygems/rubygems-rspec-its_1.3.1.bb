# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rspec-its"
DESCRIPTION = "RSpec extension gem for attribute matching"
HOMEPAGE = "https://github.com/rspec/rspec-its"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0bfc9ee7f57ee14d322e7a142ee4d55e"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-rspec-core-native \
    rubygems-rspec-expectations-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "1f99f164e2000f401f301dd82ccbae36"
SRC_URI[sha256sum] = "c404314f933ffd5ef6e2cfa87167e272477a7007467db5ec59c96ad1679c51f6"

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
