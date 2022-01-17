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

SRC_URI[md5sum] = "4ae4d38177006b9d1c5946f88b03c056"
SRC_URI[sha256sum] = "b3af503512e8c9363c0bc23f960d024be1a8267c10fce4be63564739c32e10cb"

GEM_NAME = "rspec_junit_formatter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rspec-core \
"

BBCLASSEXTEND = "native"
