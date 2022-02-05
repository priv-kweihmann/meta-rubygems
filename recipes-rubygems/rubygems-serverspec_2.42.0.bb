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

SRC_URI[md5sum] = "3bde39a7b4a99e8561c87d4928a28d23"
SRC_URI[sha256sum] = "d900f89b13487de371c14b9a15f5f8e1c577dff9b853c336a030e4436012261e"

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
