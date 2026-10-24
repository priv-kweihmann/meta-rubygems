# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: rspec_junit_formatter"
DESCRIPTION = "RSpec results that your continuous integration service can read."
HOMEPAGE = "https://github.com/sj26/rspec_junit_formatter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5450a86c5ea084a27a4cba8a69ae9dd6"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-rspec-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f614bd0c4f3afc4285943f66bd8ff732"
SRC_URI[sha256sum] = "2c505d4a79713d298bc8361532cc3eb3427d9279ffe3f8ceeeeeb72ffc279a20"

GEM_NAME = "rspec_junit_formatter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rspec-core \
"

BBCLASSEXTEND = "native"
