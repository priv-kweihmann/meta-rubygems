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

SRC_URI[md5sum] = "a69a3fd2c367df1f67c996a5f487ac80"
SRC_URI[sha256sum] = "40dde674e6ae4e6cc0ff560da25497677e34fefd2338cc467a8972f602b62b15"

GEM_NAME = "rspec_junit_formatter"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rspec-core \
"

BBCLASSEXTEND = "native"
