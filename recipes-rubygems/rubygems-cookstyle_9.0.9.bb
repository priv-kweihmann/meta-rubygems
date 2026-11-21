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

SRC_URI[md5sum] = "816b989afbb7ec2b61cccaca369f141f"
SRC_URI[sha256sum] = "6cce8c49888292acbaaa4460853778690d8bbdeea81cd2e148370429e783a30a"

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
