# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: cookstyle"
DESCRIPTION = "Cookstyle is a code linting tool that helps you to write better Chef Infra cookbooks by detecting and automatically correcting style, syntax, and logic mistakes in your code."
HOMEPAGE = "https://github.com/chef/cookstyle"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3edf03f3aa19ea46e101aa4b956c206"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-rubocop-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "d55295202d3d28a15a79d9e2213ac760"
SRC_URI[sha256sum] = "c0727abcaa6287b8feef60e5a041bcedda17e160f0ab406d2624e41a9b97ab13"

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
