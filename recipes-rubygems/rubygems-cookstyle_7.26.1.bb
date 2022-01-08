# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: cookstyle"
DESCRIPTION = "Cookstyle is a code linting tool that helps you to write better Chef Infra cookbooks by detecting and automatically correcting style, syntax, and logic mistakes in your code."
HOMEPAGE = "https://github.com/chef/cookstyle"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-rubocop-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "f8dcb1384e4a524efa8be8767edbcdf6"
SRC_URI[sha256sum] = "ed4c067c00a96b226c63538080346e451aaa259fee7fcd3b6732d40d13d3409e"

GEM_NAME = "cookstyle"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rubocop \
"

BBCLASSEXTEND = "native"
