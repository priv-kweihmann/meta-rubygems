# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rspec-its"
DESCRIPTION = "RSpec extension gem for attribute matching"
HOMEPAGE = "https://github.com/rspec/rspec-its"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=0bfc9ee7f57ee14d322e7a142ee4d55e"

DEPENDS_class-native += "\
    rubygems-rspec-core-native \
    rubygems-rspec-expectations-native \
"

RDEPENDS_${PN}_class-target += "\
    rubygems-rspec-core \
    rubygems-rspec-expectations \
"

SRC_URI[md5sum] = "964ccec1438cac7f7e249031fe4444c7"
SRC_URI[sha256sum] = "4da51040e7820daafd40f2f6216d13c90aa949f0d302a0412c9ef6074e73ea97"

GEM_NAME = "rspec-its"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_install_append() {
    # get rid of a bash dependency
    rm -rf ${GEM_HOME}/gems/rspec-its-${PV}/script/
}

BBCLASSEXTEND = "native"
