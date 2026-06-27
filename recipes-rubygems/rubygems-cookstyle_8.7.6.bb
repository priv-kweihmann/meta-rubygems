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

SRC_URI[md5sum] = "9a98fd36a5ff0013fb40b6443745f72d"
SRC_URI[sha256sum] = "5c10e5c85c91e22c2aded0c8c45fbd31957dcd50003ee9e46e97241ae84f9563"

GEM_NAME = "cookstyle"

inherit rubygems
inherit rubygentest
inherit pkgconfig

do_generate_spec:append() {
    sed -i "s#Cookstyle::RUBOCOP_VERSION#' != 0'#g" ${GEM_SPEC_FILE}
    sed -i 's|"= #{Cookstyle::RUBOCOP_VERSION}"|">= #{Cookstyle::RUBOCOP_VERSION}"|g' ${S}/lib/cookstyle.rb
}

RDEPENDS:${PN}:class-target += "\
    rubygems-rubocop \
"

BBCLASSEXTEND = "native"
