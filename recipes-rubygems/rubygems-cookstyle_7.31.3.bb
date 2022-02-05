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

SRC_URI[md5sum] = "5e7cd477efbef79a7d603e5141d05d98"
SRC_URI[sha256sum] = "f9c48ef3577cc535db9b2b7e6147f0388812cceb46fd5e2de28cf5421f301b54"

GEM_NAME = "cookstyle"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-rubocop \
"

BBCLASSEXTEND = "native"
