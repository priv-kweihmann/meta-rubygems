# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: serverspec"
DESCRIPTION = "RSpec tests for your servers configured by Puppet, Chef, Itamae or anything else"
HOMEPAGE = "http://serverspec.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9f1e84c559b0d54e801ddbe1457c114a"

DEPENDS:class-native += "\
    rubygems-multi-json-native \
    rubygems-rspec-its-native \
    rubygems-rspec-native \
    rubygems-specinfra-native \
"
RDEPENDS:${PN}:class-target += "\
    rubygems-multi-json \
    rubygems-rspec \
    rubygems-rspec-its \
    rubygems-specinfra \
"

SRC_URI[md5sum] = "6b9b309ee4dc1a1570a8317e4ef15ce9"
SRC_URI[sha256sum] = "d68b1f3ae40e3cdcd870011fbe8e76093b389438a5edb478fc34c7bf2f6be34e"

GEM_NAME = "serverspec"

inherit rubygems
inherit rubygentest
inherit pkgconfig

BBCLASSEXTEND = "native"
