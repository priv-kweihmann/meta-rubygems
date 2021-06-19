# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: serverspec"
DESCRIPTION = "RSpec tests for your servers configured by Puppet, Chef, Itamae or anything else"
HOMEPAGE = "http://serverspec.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9f1e84c559b0d54e801ddbe1457c114a"

DEPENDS_class-native += "\
    rubygems-multi-json-native \
    rubygems-rspec-its-native \
    rubygems-rspec-native \
    rubygems-specinfra-native \
"

SRC_URI[md5sum] = "bd045d8100901f9a3ce6eaa5cc097202"
SRC_URI[sha256sum] = "90c9b73ee7320c2707a7671493a0b023f1c7265604cb9a40f2805bb27cdbe4af"

GEM_NAME = "serverspec"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS_${PN}_class-target += "\
    rubygems-multi-json \
    rubygems-rspec \
    rubygems-rspec-its \
    rubygems-specinfra \
"

BBCLASSEXTEND = "native"
